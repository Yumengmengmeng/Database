package BookType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DBUtil.DBUtil;

public class bookTypeDao implements btDao{
	public void Printtype(String classNo)
	{
		BookType booktype=new BookType();
		String sql="Select * From Position where classNo=?";
		DBUtil util=new DBUtil();
		try {
		Connection connection=util.getConnection();
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, classNo);
		System.out.println(booktype.getClassNo()+"  "+booktype.getClassName()+"  "+booktype.getClassInf());
		}catch(SQLException e) {}
	}
}
