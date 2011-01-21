package net.juancarlosfernandez.helloworld.springmybatis.service.impl;

import net.juancarlosfernandez.helloworld.springmybatis.domain.Myfile;
import net.juancarlosfernandez.helloworld.springmybatis.mapper.MyfileMapper;
import net.juancarlosfernandez.helloworld.springmybatis.service.IFileService;

public class FileServiceImpl implements IFileService {

	private MyfileMapper fileMapper;

	public MyfileMapper getFileMapper() {
		return fileMapper;
	}

	public void setFileMapper(MyfileMapper fileMapper) {
		this.fileMapper = fileMapper;
	}

	public void addFile(Myfile file) {

		fileMapper.insert(file);
	}

	public void deleteFile(long id) {
		fileMapper.deleteByPrimaryKey(id);
		
	}

}
