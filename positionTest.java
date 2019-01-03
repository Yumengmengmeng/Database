package Position;

import DBUtil.*;


import java.util.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class positionTest {
	public static void main(String[] args) {
		System.out.println("请输入所查询图书条码号：");
		Scanner u=new Scanner(System.in);
		String bookNo=u.nextLine();
		Position position;
		try{
			position=new Position();
			positionDao pdao=new positionDao();
			pdao.Printadd(bookNo);
		
		}catch(Exception e) {
			e.printStackTrace();
		}// TODO Auto-generated method stub
		
	}

}
