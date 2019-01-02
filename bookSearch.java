package Book;
import java.util.Properties;
import java.sql.*;
import javax.sql.*;

import DBUtil.*;

public class bookSearch implements bookDao{
	public Book Search(String bookName,String author)
	{
		String sql="Select bookName,author,introduction,price,publishName,publishDate,number From book where bookName=? and author=?";
		DBUtil util=new DBUtil();
		Connection connection=null;
		PreparedStatement pStatement=null;
		ResultSet rSet =null;
		try{
			connection=util.getConnection();
			pStatement = connection.prepareStatement(sql);

            pStatement.setString(1, bookName);
            pStatement.setString(2, author);
           
            rSet = pStatement.executeQuery();
			if(rSet.next()){
				Book book=new Book();
				book.getNumber();
                book.getBookName();
                book.getAuthor();
                book.getIntroduction();
                book.getPrice();
                book.getPrice();
                book.getPublishName();
                book.getPublishDate();
        		return book;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            util.release(connection,pStatement,rSet);
        }
        return null;
	}
}
