package com.thxy.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.thxy.datasource.DataConnection;
import com.thxy.pojo.User;

public class MyBatisTest {
	
	public DataConnection dataConn=new DataConnection();
	
	@Test
	public void Select() throws IOException {
		SqlSession sqlSession=dataConn.getSqlSession();
		User user=sqlSession.selectOne("user.findUserById",4);
		System.out.println("id:"+user.getId());
		System.out.println("姓名:"+user.getName());
		
		sqlSession.close();
	}
}
