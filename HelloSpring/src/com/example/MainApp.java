package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {

	public static void main(String[] args) {
		
		   ApplicationContext context = new ClassPathXmlApplicationContext("BEANS.xml");
		   
		   HelloWorld objA = (HelloWorld) context.getBean("HelloWorld");
		   
		      objA.getMessage1();
		      objA.getMessage2();

		      HelloIndia objB = (HelloIndia) context.getBean("HelloIndia");
		      
		      objB.getMessage1();
		      objB.getMessage2();
		      objB.getMessage3();
		      
		      ((AbstractApplicationContext) context).registerShutdownHook();
		      
		      TextEditor te = (TextEditor) context.getBean("textEditor");
		      // spell check belongs to text editor, but it is a class of its own
		      // using inheritance in the beans we can access spell check without instantiating
		      
		      te.spellCheck();
		      
	}

}
