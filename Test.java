package Test;
import Book.*;
import DBUtil.*;
import Reader.*;
import java.util.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		System.out.println("请输入用户名：");
		Scanner x=new Scanner(System.in);
		String name=x.nextLine();
		System.out.println("请输入密码：");
		String pass=x.nextLine();
		Reader reader;
		try{
			reader=new Reader(name,pass);
			readerDao rdao=new readerDao();
			rdao.login(reader);
			boolean result=rdao.check(name);
			if(result)
			{
				System.out.println("登录成功");
				System.out.println("1.查看个人信息；");
				System.out.println("2.查找图书；");
				int a=x.nextInt();
				switch(a)
				{
					case 1:
				}
			}
			else System.out.println("登录失败");
		}catch(Exception e) {
			e.printStackTrace();
		}// TODO Auto-generated method stub
		
	}

}
