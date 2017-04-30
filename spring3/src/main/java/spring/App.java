package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.Logger;

public class App {

	public static void main(String[] args) {
		//test
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/beans/beans.xml");
		
		Logger logger = (Logger)context.getBean("logger");
		
		logger.writeConsole("Text from App to logger");
		
		( ( ClassPathXmlApplicationContext ) context).close();

	}

}
