package springlab;

import java.io.File;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springlab.dao.CloDao;
import springlab.entity.Clo;

public class Client {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//CloDao clodao = (CloDao) context.getBean("clodao");
		GradeBO gbo = (GradeBO)context.getBean("gradebo");
		
		System.out.println(gbo.getGradebookClosCSV());

	}

}
