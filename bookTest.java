package Book;

import DBUtil.*;
import java.util.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class bookTest {
		public static void main(String args[]) {
			System.out.println("请输入图书名：");
			Scanner w=new Scanner(System.in);
			String bookName=w.nextLine();
			System.out.println("请输入作者名：");
			String author=w.nextLine();
			Book book;
			try {
				book=new Book();
				bookSearch rdao=new bookSearch();
				book=rdao.Search(bookName,author);
				if(book!=null) {
					System.out.println("");
				}
				else {
					System.out.println("查询失败");
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
		} 
}
