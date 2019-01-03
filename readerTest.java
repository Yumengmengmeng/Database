package Reader;

import DBUtil.*;
import java.util.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readerTest {
			public static void main(String[] args) {
				System.out.println("«Î ‰»Î”√ªß±‡∫≈£∫");
				Scanner x=new Scanner(System.in);
				String name=x.nextLine();
				System.out.println("«Î ‰»Î√‹¬Î£∫");
				String pass=x.nextLine();
				Reader reader;
				try{
					reader=new Reader(name,pass);
					readerDao rdao=new readerDao();
					rdao.login(reader);
					boolean result=rdao.check(name);
					if(result)
					{
						System.out.println("µ«¬º≥…π¶");
					}
					else System.out.println("µ«¬º ß∞‹");
				}catch(Exception e) {
					e.printStackTrace();
				}// TODO Auto-generated method stub
				
			

		


	}

}
