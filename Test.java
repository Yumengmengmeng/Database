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
		System.out.println("�������û�����");
		Scanner x=new Scanner(System.in);
		String name=x.nextLine();
		System.out.println("���������룺");
		String pass=x.nextLine();
		Reader reader;
		try{
			reader=new Reader(name,pass);
			readerDao rdao=new readerDao();
			rdao.login(reader);
			boolean result=rdao.check(name);
			if(result)
			{
				System.out.println("��¼�ɹ�");
				System.out.println("1.�鿴������Ϣ��");
				System.out.println("2.����ͼ�飻");
				int a=x.nextInt();
				switch(a)
				{
					case 1:
				}
			}
			else System.out.println("��¼ʧ��");
		}catch(Exception e) {
			e.printStackTrace();
		}// TODO Auto-generated method stub
		
	}

}
