package Reader;
import Book.*;
import DBUtil.*;
import Reader.*;
import java.util.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readerDaoImple {
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
		}catch(Exception e) {
			e.printStackTrace();
		}// TODO Auto-generated method stub

	}

}
