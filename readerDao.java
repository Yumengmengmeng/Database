package Reader;
import java.util.Properties;
import java.sql.*;
import javax.sql.*;
import DBUtil.*;
import java.util.*;

public class readerDao implements rDao
{
	public Reader login(Reader reader)
	{
		String sql="Select * From reader where readerNo=? and password=?";
		DBUtil util=new DBUtil();
		Connection connection=null;
		PreparedStatement pStatement=null;
		ResultSet rSet=null;
		try{
			connection=util.getConnection();
			pStatement = connection.prepareStatement(sql);

            pStatement.setString(1, reader.getReaderNo());
            pStatement.setString(2, reader.getPassword());

            rSet = pStatement.executeQuery();
			if(rSet.next()){
                reader = new Reader();
                reader.setReaderNo(rSet.getString("readerNo"));
                reader.setReaderName(rSet.getString("readerName"));
                reader.setPassword(rSet.getString("password"));
				}
                return reader;     
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
           util.release(connection, pStatement, rSet);
        }
        return null;
    }
	    //���
    public boolean check(String readerNo) {
        // TODO Auto-generated method stub
        String sql = "select readerNo,readerName,password from reader where readerNo=? ";

        DBUtil util = new DBUtil();
        Connection connection;

        try {
        	connection = util.getConnection();
            PreparedStatement pStatement = connection.prepareStatement(sql);

            pStatement.setString(1,readerNo);

            ResultSet rSet = pStatement.executeQuery();

            if(rSet.next()){
                return true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
        }
        return false;
    }
    public void printReader(Reader reader)
    {
    	String sql="Select readerNo,readerName,readerSex,tel,department,class"
    			+ " From reader where readerNo=? and password=? ";
		DBUtil util=new DBUtil();
		Connection connection=null;
		PreparedStatement pStatement=null;
		ResultSet rSet=null;
		try{
			connection=util.getConnection();
			pStatement = connection.prepareStatement(sql);

            pStatement.setString(1, reader.getReaderNo());
           pStatement.setString(2, reader.getPassword());

            rSet = pStatement.executeQuery();
//			System.out.println("ѧ�ţ�"+reader.getReaderNo());
//			System.out.println("������"+rSet.getString("readerName"));
//			System.out.println("ѧ���Ա�"+rSet.getString("readerSex"));
//			System.out.println("�绰��"+rSet.getLong("tel"));
//			System.out.println("ϵ��"+rSet.getString("department"));
//			System.out.println("ѧ���༶��"+rSet.getString("class")); 
	
			while(rSet.next()){
                reader = new Reader();
                reader.setReaderNo(rSet.getString("readerNo"));
                reader.setReaderName(rSet.getString("readerName"));
                reader.setReaderSex(rSet.getString("readerSex"));
                reader.setTel(rSet.getLong("tel"));
                reader.setDepartment(rSet.getString("department"));
                reader.setClassNo(rSet.getString("class"));
			System.out.println("ѧ�ţ�"+rSet.getString("readerNo"));
			System.out.println("������"+rSet.getString("readerName"));
			System.out.println("ѧ���Ա�"+rSet.getString("readerSex"));
			System.out.println("�绰��"+rSet.getLong("tel"));
			System.out.println("ϵ��"+rSet.getString("department"));
			System.out.println("ѧ���༶��"+rSet.getString("class")); 
			}  

			

			
//			System.out.println("ѧ�ţ�"+reader.getReaderNo());
//				System.out.println("������"+reader.getReaderName());
//				System.out.println("ѧ���Ա�"+reader.getReaderSex());
//				System.out.println("�绰��"+reader.getReaderSex());
//				System.out.println("ϵ��"+reader.getReaderSex());
//				System.out.println("ѧ���༶��"+reader.getReaderSex()); 
//				System.out.println("password��"+reader.getPassword());
			
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
           util.release(connection, pStatement, rSet);
        }
    }
}


