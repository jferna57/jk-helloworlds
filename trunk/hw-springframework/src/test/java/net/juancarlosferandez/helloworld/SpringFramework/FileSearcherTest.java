package net.juancarlosferandez.helloworld.SpringFramework;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import net.juancarlosferandez.helloworld.SpringFramework.domain.MyFile;
import net.juancarlosferandez.helloworld.SpringFramework.service.FileSearcherImpl;
import net.juancarlosferandez.helloworld.SpringFramework.service.IFileSearcher;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class FileSearcherTest{

	@Test
	public void filesInTempFolderAreGreaterThanZero() {
		// create the spring container using the AppConfig @Configuration class
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);

		// retrieve the beans we'll use during testing
		IFileSearcher fileSearcher = ctx.getBean(FileSearcherImpl.class);

		MyFile[] files = fileSearcher.searchFiles("/tmp");

		assertTrue(files.length > 0);
	}

}
