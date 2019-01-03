package Book;
import java.util.Properties;
import java.sql.*;
import javax.sql.*;

import BookType.*;
import DBUtil.*;

public class bookSearch implements bookDao{
	public Book Search(String bookName,String author)
	{
		String sql="Select bookName,author,introduction,price,publishName,publishDate,number,bookNo"
				+ " From book where bookName=? and author=?";
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
			while(rSet.next()){
				Book book=new Book();
				book.setNumber(rSet.getString("number"));
                book.setBookName(rSet.getString("bookName"));
                book.setAuthor(rSet.getString("author"));
                book.setIntroduction(rSet.getString("introduction"));
                book.setPrice(rSet.getFloat("price"));
                book.setPublishName(rSet.getString("publishName"));
                book.setPublishDate(rSet.getString("publishDate"));
                book.setBookNo(rSet.getString("bookNo"));
                System.out.println("书名:"+book.getBookName());
				System.out.println("作者:"+book.getAuthor());
				System.out.println("书的简介:"+book.getIntroduction());
				System.out.println("价格:"+book.getPrice());
				System.out.println("出版日期:"+book.getPublishDate());
				System.out.println("出版社:"+book.getPublishName());
				System.out.println("条码号:"+book.getNumber());
				System.out.println("索书号:"+book.getBookNo());
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
	public void Recommend(String number)
	{
		String sql="Select bookName,author,className,classInf From book,booktype where number=? ";
		DBUtil util=new DBUtil();
		BookType booktype;
		Connection connection=null;
		PreparedStatement pStatement=null;
		ResultSet rSet =null;
		try{
			connection=util.getConnection();
			pStatement = connection.prepareStatement(sql);
			
          pStatement.setString(1, number);
            
            rSet = pStatement.executeQuery();
			if(rSet.next()){
				Book book=new Book();
                book.setBookName(rSet.getString("bookName"));
                book.setAuthor(rSet.getString("author"));
                book.setPublishDate(rSet.getString("publishDate"));
                book.setBookNo(rSet.getString("bookNo"));
                System.out.println("书名:"+book.getBookName());
				System.out.println("作者:"+book.getAuthor());

            }
			
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            util.release(connection,pStatement,rSet);
     } //   return null;
	}
}
