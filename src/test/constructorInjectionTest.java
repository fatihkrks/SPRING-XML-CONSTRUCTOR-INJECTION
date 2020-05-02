package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;

public class constructorInjectionTest {
public static void main(String[] args) {
	ApplicationContext context=new  ClassPathXmlApplicationContext("applicationContext-constructor-injection.xml");
	Employee employee=context.getBean("employeeId1",Employee.class);
	Employee employee2=context.getBean("employeeId2",Employee.class);
	Employee employee3=context.getBean("employeeId3", Employee.class);
	System.out.println(employee);
	System.out.println(employee2);
	System.out.println(employee3);
}
}
