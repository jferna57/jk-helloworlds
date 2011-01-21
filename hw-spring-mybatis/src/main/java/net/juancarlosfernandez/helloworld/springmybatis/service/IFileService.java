package net.juancarlosfernandez.helloworld.springmybatis.service;

import net.juancarlosfernandez.helloworld.springmybatis.domain.Myfile;

public interface IFileService {

	public void addFile(Myfile file);
	
	public void deleteFile(long id);

}
