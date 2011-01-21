package net.juancarlosferandez.helloworld.SpringFramework.service;

import net.juancarlosferandez.helloworld.SpringFramework.domain.MyFile;

public interface IFileSearcher {
	
	public MyFile[] searchFiles(String path);

}
