package Position;
import Book.Book;
public class Position {
	private String bookNo;
	private String address;
	private boolean inLibrary;
	
	Position()
	{
		Book book;
	}
	Position(String bookNo,String address,boolean inLibrary)
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
	
	public void setInLibrary(boolean inLibrary )
	{
		this.inLibrary=inLibrary;
	}
	public boolean getInLibrary()
	{
		return inLibrary;
	}
}
