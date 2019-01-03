package Main;
import Book.*;
import BookType.*;
import Position.*;
import DBUtil.*;
import Reader.*;
import java.util.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		System.out.println("请输入用户编号：");
		Scanner x=new Scanner(System.in);
		String name1=x.nextLine();
		String name=name1.trim();
		System.out.println("请输入密码：");
		String pass1=x.nextLine();
		String pass=pass1.trim();
//		System.out.print(name1);
//		System.out.print(pass1);
		Book book;
		Reader reader;
		bookSearch bs;
		bookTypeDao bt;
		positionDao pt;
		try{
			reader=new Reader(name,pass);
			readerDao rdao=new readerDao();
			
			rdao.login(reader);
			boolean result=rdao.check(name);
			if(result)
			{
				System.out.println("登录成功");
				System.out.println("1.查看个人信息；");
				System.out.println("2.查找图书；");
//				
				int a=x.nextInt();
				switch(a)
				{
					case 1:
						rdao.printReader(reader);
						System.out.println("是否继续查询书籍？Yes/No");
						Scanner y=new Scanner(System.in);
						String con=y.nextLine();
						if(!con.equals("Yes"))
							break;
					case 2:
					do{ System.out.println("请输入要查找的书名：");
						x.nextLine();
						String bookname=x.nextLine();
						System.out.println("请输入要查找的作者：");
						String author=x.nextLine();
						bs=new bookSearch();
						book=new Book();
						bs.Search(bookname, author);
						if(book!=null)
						{
							
							System.out.println("是否显示相关书籍推荐？Yes/No");
							String i=x.nextLine();
							if(i.equals("Yes"))
							{
							String number=book.getNumber();
							bs.Recommend(number);
							}
//								else if(i.equals("No")) break;
							System.out.println("是否查询图书位置？Yes/No");
//							x.nextLine();
							String m=x.nextLine();
							if(m.equals("Yes"))
							{
								System.out.println("请输入需要查询书目的索书号号：");
								String bookNo=x.nextLine();
								pt=new positionDao();
								pt.Printadd(bookNo);
							}
						}
						else System.out.println("查找失败！未找到当前图书");
						System.out.println("是否继续查找？Continue/Finish");
//						x.nextLine();
					}	while(x.nextLine().equals("Continue"));
				}
			}
			else System.out.println("登录失败");
		}catch(Exception e) {
			e.printStackTrace();
		}// TODO Auto-generated method stub
		
	}

}
