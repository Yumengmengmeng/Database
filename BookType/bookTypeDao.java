package BookType;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import DBUtil.DBUtil;

public class bookTypeDao implements btDao{
	public void Printtype(String number)
	{
		BookType booktype=new BookType();
		String sql="Select * From bookClass,book where (bookClass.classNo=book.classNo) and number=?";
		ResultSet rSet=null;
		try {
			PreparedStatement pStatement=null;
			DBUtil util=new DBUtil();
			Connection connection=util.getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, number);
			rSet = pStatement.executeQuery();
			while(rSet.next()){
				booktype=new BookType();
				booktype.setClassNo(rSet.getString("classNo"));
				booktype.setClassName(rSet.getString("className"));
				booktype.setClassInf(rSet.getString("classInf"));
				System.out.println("类别编号："+rSet.getString("classNo"));
				System.out.println("类别名称："+rSet.getString("className"));
				System.out.println("类别介绍："+rSet.getString("classInf"));
			}
		}catch(SQLException e) {}
	}
}