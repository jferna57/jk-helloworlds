package net.juancarlosfernandez.helloworld.springmybatis;

import static org.junit.Assert.*;
import net.juancarlosfernandez.helloworld.springmybatis.domain.Myfile;
import net.juancarlosfernandez.helloworld.springmybatis.service.IFileService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileServiceTest {

	@Test
	public void insertNewFileInDb() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		IFileService service = (IFileService) ctx.getBean("fileService");
		
		Myfile myFile = new Myfile();
		
		myFile.setId((long)2);
		myFile.setName("test");
		
		service.addFile(myFile);
		
		service.deleteFile((long)2);
		
		assertTrue(true);
		
	}
}
