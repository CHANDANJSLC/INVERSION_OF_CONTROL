package com.Tap.IoC1;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Tap.IoC1.Impl.Java_Trainer;
import com.Tap.IoC1.Impl.SQL_Trainer;
import com.Tap.IoC1.Impl.Web_Trainer;
import com.Tap.IoC1.interfaces.Trainer;
public class App {
  public static void main(String[] args) 
  {
	  ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	  
	  Trainer jt = (Java_Trainer) ac.getBean("jt");
	  Trainer st= (SQL_Trainer) ac.getBean("st");
	  Trainer wt = (Web_Trainer) ac.getBean("wt");


	  
	  jt.giveTask();
	  st.giveTask();
	  wt.giveTask();
  }
}
