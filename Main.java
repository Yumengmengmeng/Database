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
		System.out.println("�������û���ţ�");
		Scanner x=new Scanner(System.in);
		String name1=x.nextLine();
		String name=name1.trim();
		System.out.println("���������룺");
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
				System.out.println("��¼�ɹ�");
				System.out.println("1.�鿴������Ϣ��");
				System.out.println("2.����ͼ�飻");
//				
				int a=x.nextInt();
				switch(a)
				{
					case 1:
						rdao.printReader(reader);
						System.out.println("�Ƿ������ѯ�鼮��Yes/No");
						Scanner y=new Scanner(System.in);
						String con=y.nextLine();
						if(!con.equals("Yes"))
							break;
					case 2:
					do{ System.out.println("������Ҫ���ҵ�������");
						x.nextLine();
						String bookname=x.nextLine();
						System.out.println("������Ҫ���ҵ����ߣ�");
						String author=x.nextLine();
						bs=new bookSearch();
						book=new Book();
						bs.Search(bookname, author);
						if(book!=null)
						{
							
							System.out.println("�Ƿ���ʾ����鼮�Ƽ���Yes/No");
							String i=x.nextLine();
							if(i.equals("Yes"))
							{
							String number=book.getNumber();
							bs.Recommend(number);
							}
//								else if(i.equals("No")) break;
							System.out.println("�Ƿ��ѯͼ��λ�ã�Yes/No");
//							x.nextLine();
							String m=x.nextLine();
							if(m.equals("Yes"))
							{
								System.out.println("��������Ҫ��ѯ��Ŀ������źţ�");
								String bookNo=x.nextLine();
								pt=new positionDao();
								pt.Printadd(bookNo);
							}
						}
						else System.out.println("����ʧ�ܣ�δ�ҵ���ǰͼ��");
						System.out.println("�Ƿ�������ң�Continue/Finish");
//						x.nextLine();
					}	while(x.nextLine().equals("Continue"));
				}
			}
			else System.out.println("��¼ʧ��");
		}catch(Exception e) {
			e.printStackTrace();
		}// TODO Auto-generated method stub
		
	}

}
