package Position;
import Book.Book;
public class Position {
	private String bookNo;
	private String address;
	private String inLibrary;
	
	Position()
	{
		Book book;
	}
	Position(String bookNo,String address,String inLibrary)
	{
		this.bookNo=bookNo;
		this.address=address;
		this.inLibrary=inLibrary;
	}
	public void setBookNo(String bookNo)
	{
		this.bookNo=bookNo;
	}
	public String getBookNo()
	{
		return bookNo;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	
	public void setInLibrary(String inLibrary )
	{
		this.inLibrary=inLibrary;
	}
	public String getInLibrary()
	{
		return inLibrary;
	}
}
