package Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Position.Position;
import DBUtil.DBUtil;

public class positionDao implements pDao {
	public void Printadd(String bookNo)
	{
		Position posi=new Position();
		String sql="Select bookNo,address,inLibrary From position Where bookNo=?";
		DBUtil util=new DBUtil();
		try {
			Connection connection=util.getConnection();
			PreparedStatement pStatement = connection.prepareStatement(sql);
			ResultSet rSet;
			pStatement.setString(1, bookNo);
			rSet = pStatement.executeQuery();
		while(rSet.next()){
			posi=new Position();
			posi.setBookNo(rSet.getString("bookNo"));
			posi.setAddress(rSet.getString("address"));
			posi.setInLibrary(rSet.getString("inLibrary"));	
			System.out.println("ͼ���ţ�"+rSet.getString("bookNo"));
			System.out.println("ͼ��ݲأ�"+rSet.getString("address"));
			System.out.println("����״̬��"+posi.getInLibrary());
			}
		}catch(SQLException e) {}
	}
}
