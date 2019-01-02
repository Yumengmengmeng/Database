package DBUtil;

import java.util.Properties;

import javax.sql.DataSource;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class DBUtil {
	private static DataSource ds =null;
	static {
		try {
			InputStream in = DBUtil.class.getResourceAsStream("dbcp.properties");
			Properties prop = new Properties();
			prop.load(in);
			ds = BasicDataSourceFactory.createDataSource(prop);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
	public static void release(Connection conn,Statement st,ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			rs=null;
		}
		if(st!=null) {
			try {
				st.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			st=null;
		}
		if(conn!=null) {
			try {
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			conn=null;
		}
	}

}

