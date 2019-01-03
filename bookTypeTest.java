package BookType;

import DBUtil.*;
import Position.Position;
import Position.positionDao;

import java.util.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class bookTypeTest {
	public static void main(String[] args) {
		System.out.println("请输入所查询图书条码号：");
		Scanner u=new Scanner(System.in);
		String number=u.nextLine();
		BookType booktype;
		bookTypeDao btDao;
		try{
			booktype=new BookType();
			bookTypeDao bdao=new bookTypeDao();
			bdao.Printtype(number);
		
		}catch(Exception e) {
			e.printStackTrace();
		}// TODO Auto-generated method stub
		
	}
}
