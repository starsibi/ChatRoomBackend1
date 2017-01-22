/*package be.g00glen00b.config;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Controller;

import be.g00glen00b.model.Blog;
import be.g00glen00b.model.Role;
import be.g00glen00b.model.Forum;
import be.g00glen00b.model.Friend;
import be.g00glen00b.model.UserDetails;
import be.g00glen00b.model.UserRole;

@Configuration
@ComponentScan(basePackages = "be.g00glen00b", excludeFilters = {
    @ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION),
    @ComponentScan.Filter(value = Configuration.class, type = FilterType.ANNOTATION)
})
public class AppConfig {
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	dataSource.setUrl("jdbc:oracle:thin:@//localhost:1521/xe");

	dataSource.setUsername("system");
	dataSource.setPassword("pass");
	return dataSource;
	}
	    
	   
	    
	    private Properties getHibernateProperties() {
	    Properties properties = new Properties();
	    properties.put("hibernate.show_sql", "true");
	      properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
	     properties.put("hibernate.hbm2ddl.auto", "update");
	     properties.put("hibernate.default_schema", "sibi");
	    return properties;
	    }
	    
	    @Autowired
	    @Bean(name = "sessionFactory")
	    public SessionFactory getSessionFactory(DataSource dataSource) {
	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    sessionBuilder.addProperties(getHibernateProperties());
	    sessionBuilder.addAnnotatedClass(Blog.class);
	    sessionBuilder.addAnnotatedClass(Forum.class);
	    sessionBuilder.addAnnotatedClass(Friend.class);
	    sessionBuilder.addAnnotatedClass(Role.class);
	    sessionBuilder.addAnnotatedClass(UserDetails.class);
	    sessionBuilder.addAnnotatedClass(UserRole.class);
	      return sessionBuilder.buildSessionFactory();
	    }
	    
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
	SessionFactory sessionFactory) {
	HibernateTransactionManager transactionManager = new HibernateTransactionManager(
	sessionFactory);

	return transactionManager;
	}
	    
	   }
	
*/