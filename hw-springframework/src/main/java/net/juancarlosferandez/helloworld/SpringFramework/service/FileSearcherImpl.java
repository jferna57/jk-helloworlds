package net.juancarlosferandez.helloworld.SpringFramework.service;

import java.io.File;

import net.juancarlosferandez.helloworld.SpringFramework.domain.MyFile;

public class FileSearcherImpl implements IFileSearcher {

	public MyFile[] searchFiles(String path) {

		File aFile = new File(path);

		File[] searchFiles = aFile.listFiles();

		MyFile[] result = new MyFile[searchFiles.length];

		for (int i = 0; i < searchFiles.length; i++) {
			MyFile myFile = new MyFile();
			myFile.setId_file(i);
			myFile.setName(searchFiles[i].getName());
			result[i] = myFile;
		}

		return result;
	}

}
