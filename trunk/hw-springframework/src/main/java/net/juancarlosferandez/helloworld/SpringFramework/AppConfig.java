package net.juancarlosferandez.helloworld.SpringFramework;

import net.juancarlosferandez.helloworld.SpringFramework.service.FileSearcherImpl;
import net.juancarlosferandez.helloworld.SpringFramework.service.IFileSearcher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

	public @Bean IFileSearcher fileSearcher() {
		return new FileSearcherImpl();
	}

}