package net.juancarlosfernandez.helloworld.mybatis;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;

import net.juancarlosfernandez.helloworld.mybatis.domain.Myfile;
import net.juancarlosfernandez.helloworld.mybatis.mapper.MyfileMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MyFileTest {

	@Test
	public void insertNewFileInDB(){
		String resource = "configuration.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			
			SqlSession session = sqlMapper.openSession();
			MyfileMapper fileMapper = session.getMapper(MyfileMapper.class);
			
			Myfile record = new Myfile();
			record.setId((long)2);
			record.setName("test");
			record.setPath("/");
			record.setLength("1");
			
			// TODO: Cambiar este trozo que está deprecado
			record.setLastChange(new Date(2010,31,10));
			
			fileMapper.insert(record);
			
			fileMapper.deleteByPrimaryKey((long)2);
			
			session.close();
			
		} catch (IOException e) {
			assertTrue(false);
		}
		

	}
}
