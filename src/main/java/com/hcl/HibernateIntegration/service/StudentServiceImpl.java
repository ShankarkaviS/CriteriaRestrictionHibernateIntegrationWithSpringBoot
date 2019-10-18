package com.hcl.HibernateIntegration.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.HibernateIntegration.dto.PhoneDTO;
import com.hcl.HibernateIntegration.dto.TotalDTO;
import com.hcl.HibernateIntegration.model.Calls;
import com.hcl.HibernateIntegration.model.Employee;
import com.hcl.HibernateIntegration.model.Persion;
import com.hcl.HibernateIntegration.model.Phone;
import com.hcl.HibernateIntegration.model.Phones;
import com.hcl.HibernateIntegration.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	@Override
	public List<Tuple> getStudent() {
	
		List<Tuple> studentList = null;
		try  {
			getSession().beginTransaction();
			CriteriaBuilder builder =getSession().getCriteriaBuilder();
			CriteriaQuery<Tuple> criteriaQuery = builder.createQuery(Tuple.class);
			Root<Student> studentRoot = criteriaQuery.from(Student.class);
			Root<Persion> persionRoot = criteriaQuery.from(Persion.class);
			criteriaQuery.multiselect(studentRoot, persionRoot);
			Predicate studentPredicate = (builder.and(builder.between(studentRoot.get("age"), 21, 29),
					builder.between(studentRoot.get("weight"), 70, 80)));
			Predicate persionPredicate = (builder.between(persionRoot.get("weight"), 70, 90));
			criteriaQuery.where(studentPredicate, persionPredicate);

			Query<Tuple> query = getSession().createQuery(criteriaQuery);
			studentList = query.getResultList();
			System.out.println();
			for (Tuple student : studentList) {
				System.out.println("Student Name is : " + (Student) student.get(studentRoot.get("name")));
				System.out.println("Student Place is : " + (Student) student.get(studentRoot.get("place")));
				System.out.println();
				List<Phone> phoneList = student.get(studentRoot.get("Phones"));
				for (Phone phone : phoneList) {
					System.out.println("Phone Id is : " + phone.getId());
					System.out.println("Phone Number : " + phone.getPhoneNumber());
					System.out.println("Phone Type is : " + phone.getPhone());
				}
			}
			
		} catch (Exception e) {
			System.out.println("Exception Occur " + e);
		}
		return studentList;
	}

	@Override
	public List<Phones> getPhones() {
		
		List<Phones> phoneList = null;
		try  {
	
			System.out.println("Welcome to Hcltechnology3");
			CriteriaBuilder builder = getSession().getCriteriaBuilder();
			CriteriaQuery<Phones> criteriaQuery = builder.createQuery(Phones.class);
			Root<Phones> root = criteriaQuery.from(Phones.class);
			root.join("employee");
			criteriaQuery.where(builder.isNotEmpty(root.get("callList")));
			Query<Phones> query = getSession().createQuery(criteriaQuery);
			phoneList = query.list();
			System.out.println();
			for (Phones phone : phoneList) {
				System.out.println("Phone Details...");
				System.out.println("Phone ID : " + phone.getPhoneId());
				System.out.println("Phone Name : " + phone.getpName());
				System.out.println("Phone Number : " + phone.getpNumber());
				System.out.println("Phone Type : " + phone.getPhoneType());
				System.out.println();

				Employee emps = (Employee) phone.getEmployee();
				System.out.println("Employee Details...");
				System.out.println("Employee Name : " + emps.getEmpName());
				System.out.println("Employee Experience : " + emps.getExperience());
				System.out.println("Employee Destination : " + emps.getDestination());
				System.out.println("Employee Place : " + emps.getPlace());
				System.out.println();
				List<Calls> callList = phone.getCallList();
				System.out.println("Call List Details...");
				for (Calls call : callList) {
					System.out.println("Call Duriation : " + call.getDuration());
					System.out.println("Call Dates : " + call.getDate());
				}
				System.out.println();
			}
		
		} catch (Exception e) {
			System.out.println();
		}
		
		return phoneList;
	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee> empList=null;
		try
		{
			getSession().beginTransaction();
	CriteriaBuilder builder=getSession().getCriteriaBuilder();
	CriteriaQuery<Employee> criteriaQuery=builder.createQuery(Employee.class);
	Root<Employee> root=criteriaQuery.from(Employee.class);
	ParameterExpression<String> parameterValue=builder.parameter(String.class);
	criteriaQuery.where(builder.equal(root.get("empName"),parameterValue ));

	Query<Employee> query= getSession().createQuery(criteriaQuery);
	query.setParameter(parameterValue, "Shankar");
	 empList=query.list();
		System.out.println();
		getSession().getTransaction().commit();
	for(Employee emp: empList)
	{
		System.out.println(emp);
		System.out.println();
	}
		}catch(Exception e)
		{
			System.out.println("Exception Occur "+e);
		}
		
		return empList;
	}

	@Override
	public Long totalStudent() {
		Long totalStudent=null;
		try
		{
			getSession().beginTransaction();
			CriteriaBuilder builder = getSession().getCriteriaBuilder();
			CriteriaQuery<Long> criteriaQuery = builder.createQuery(Long.class);
			Root<Student> root = criteriaQuery.from(Student.class);
			criteriaQuery.select(builder.count(root));
			 totalStudent = getSession().createQuery(criteriaQuery).getSingleResult();
			getSession().getTransaction().commit();
			System.out.println("Total Student : " + totalStudent);
		} catch (Exception e) {
			System.out.println("Exception Occur" + e);
		}
		return totalStudent;
	}

	@Override
	public TotalDTO getValues() {
		TotalDTO totalDtos= null;
		try
		{
			getSession().beginTransaction();
	CriteriaBuilder builder=getSession().getCriteriaBuilder();
	CriteriaQuery<TotalDTO> criteriaQuery=builder.createQuery(TotalDTO.class);
	Root<Student> root=	criteriaQuery.from(Student.class);
		
	Expression<Long> totalStudent=builder.count(root);
	Expression<Double>	avgWeight=	builder.avg(root.get("weight"));
	Expression<Double>	maxWeight=	builder.max(root.get("weight"));
	Expression<Integer>	minAge=	builder.min(root.get("age"));
	
	criteriaQuery.select(builder.construct(TotalDTO.class,totalStudent,avgWeight,maxWeight,minAge));
		
Query<TotalDTO>  query=	getSession().createQuery(criteriaQuery);
 totalDtos=query.getSingleResult();
getSession().getTransaction().commit();
System.out.println( totalDtos.getAvgWeight());
System.out.println( totalDtos.getTotalStudent());
System.out.println( totalDtos.getMaxWeight());
System.out.println( totalDtos.getMinAge());
	
		}catch(Exception e)
		{
			System.out.println("Exception Occur"+e);
		}		
		
		return totalDtos;
	}

	@Override
	public List<Object> getAllDependency() {
		List<Object> phoneList=null;
		try  {
			 getSession().beginTransaction();
			CriteriaBuilder builder = getSession().getCriteriaBuilder();
			CriteriaQuery<Object> criteriaQuery = builder.createQuery(Object.class);
			Root<Phones> root = criteriaQuery.from(Phones.class);
			root.fetch("employee");
			root.fetch("callList");
			criteriaQuery.where(builder.isNotEmpty(root.get("callList")));
			
		//	criteriaQuery.select(builder.construct(PhoneDTO.class, selections))
			Query<Object> query = getSession().createQuery(criteriaQuery);
			 phoneList = query.getResultList();
			 getSession().getTransaction().commit();
			System.out.println();
		
		} catch (Exception e) {
			System.out.println();
		}
		return phoneList;
	}

	

	
	
}
