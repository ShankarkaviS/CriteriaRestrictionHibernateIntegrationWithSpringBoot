package com.hcl.HibernateIntegration.HibernateUtil;

/*import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@PropertySource(value= {"classpath:application.properties"})*/
public class DBConfig {
	
	/*
	 * @Value("${com.mysql.jdbc.Driver}") private String driverClass;
	 * 
	 * @Value("${spring.datasource.url}") private String url;
	 * 
	 * @Value("${spring.datasource.username}") private String username;
	 * 
	 * @Value("${spring.datasource.password}") private String password;
	 * 
	 * @Value("${spring.jpa.properties.hibernate.dialect}") private String dialect;
	 * 
	 * 
	 * public String getDriverClass() { return driverClass; } public void
	 * setDriverClass(String driverClass) { this.driverClass = driverClass; } public
	 * String getUrl() { return url; } public void setUrl(String url) { this.url =
	 * url; } public String getUsername() { return username; } public void
	 * setUsername(String username) { this.username = username; } public String
	 * getPassword() { return password; } public void setPassword(String password) {
	 * this.password = password; } public String getDialect() { return dialect; }
	 * public void setDialect(String dialect) { this.dialect = dialect; }
	 * 
	 * 
	 * @Bean public DataSource getDataSource() { DriverManagerDataSource
	 * dataSource=new DriverManagerDataSource(url, username, password);
	 * dataSource.setDriverClassName(driverClass); return dataSource; }
	 * 
	 * private Properties getHibernateProperties() { Properties properties= new
	 * Properties(); properties.put("hibernate.dialect", dialect);
	 * properties.put("hibernate.hbm2ddl.auto", "update");
	 * properties.put("hibernate.show_sql","true");
	 * properties.put("hibernate.format_sql","true"); return properties;
	 * 
	 * }
	 * 
	 * @Bean public LocalSessionFactoryBean getSessionFactory() {
	 * LocalSessionFactoryBean factory= new LocalSessionFactoryBean();
	 * factory.setDataSource(getDataSource());
	 * factory.setHibernateProperties(getHibernateProperties());
	 * factory.setPackagesToScan(new String[]
	 * {"com.hcl.HibernateIntegration.model"}); return factory; }
	 * 
	 * 
	 * @Bean
	 * 
	 * @Autowired public HibernateTransactionManager
	 * getTransactionManager(SessionFactory factory) { HibernateTransactionManager
	 * transactionManager= new HibernateTransactionManager();
	 * transactionManager.setSessionFactory(factory); return transactionManager; }
	 */
}
