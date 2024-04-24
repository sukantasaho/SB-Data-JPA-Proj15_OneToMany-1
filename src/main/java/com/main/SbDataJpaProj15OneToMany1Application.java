package com.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.entity.College;
import com.main.entity.Student;
import com.main.services.ICollegeService;

@SpringBootApplication
public class SbDataJpaProj15OneToMany1Application {

	public static void main(String[] args) {
	  ApplicationContext ctx = SpringApplication.run(SbDataJpaProj15OneToMany1Application.class, args);
	  ICollegeService service = ctx.getBean("cService", ICollegeService.class);
	  Student s1 = new Student("Sukanta Sahoo","Electrical Engg","Bhadrak","s@gmail.com",7877766788l);
	  Student s2 = new Student("Amrita Sahoo","Mechanical Engg","Jajpur","g@gmail.com",9887777889l);
	  List<Student> sList = List.of(s1,s2);
	  College c = new College("Govt College Of Engg. Keonjhar","Keonjhar",sList);
	  System.out.println(service.registerStudent(c));
	  
	  ((ConfigurableApplicationContext) ctx).close();
	}

}
