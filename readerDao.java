package Reader;
import java.util.Properties;
import java.sql.*;
import javax.sql.*;
import DBUtil.*;

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
	    //¼ì²é
    public boolean check(String readerNo) {
        // TODO Auto-generated method stub
        String sql = "select readerNo,readerName,password from reader where readerName=? ";

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
    	String sql="Select readerNo,readerName,readerSex,tel,department,class From reader where readerNo=? and password=?";
		DBUtil util=new DBUtil();
		Connection connection=null;
		PreparedStatement pStatement=null;
		ResultSet rSet=null;
		try{
			connection=util.getConnection();
			pStatement = connection.prepareStatement(sql);

            pStatement.setString(1, reader.getReaderName());
            pStatement.setString(2, reader.getPassword());

            rSet = pStatement.executeQuery();
			if(rSet.next()){
                reader = new Reader();
                reader.setReaderNo(rSet.getString("readerNo"));
                reader.setReaderName(rSet.getString("readerName"));
                reader.setReaderSex(rSet.getString("readerSex"));
                reader.setTel(rSet.getLong("Tel"));
                reader.setDepartment(rSet.getString("department"));
                reader.setClassNo(rSet.getString("class"));
				} 
			System.out.println(reader.getReaderNo());
			System.out.println(reader.getReaderName());
			System.out.println(reader);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
           util.release(connection, pStatement, rSet);
        }
    }
}


