package Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Position.Position;
import DBUtil.DBUtil;

public class positionDao implements pDao {
	public void Printadd(String bookNo)
	{
		Position posi=new Position();
		String sql="Select bookNo,address,inLibrary From Position where bookNo=?";
		DBUtil util=new DBUtil();
		try {
		Connection connection=util.getConnection();
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, bookNo);
		System.out.println(posi.getBookNo()+"  "+posi.getAddress()+"  "+posi.getInLibrary());
		}catch(SQLException e) {}
	}
}
