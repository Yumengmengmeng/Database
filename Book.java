package Book;

public class Book {
	private String bookNo; //索书号
	private String bookName;  //图书名称
	private String author;  //作者
	private String introduction;  //作者简介
	private float price;  //价格
	private String publishName;  //图书出版社
	private String publishDate;  //图书出版日期
	private String Number;  //条码号
	
	
	
	public Book(String bookNo, String bookName, String author, String introduction, float price, String publishName, String publishDate,String Number)
	{
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.author = author;
		this.introduction= introduction;
		this.price = price;
		this.publishName = publishName;
		this.publishDate = publishDate;
		this.Number = Number;
	}

	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String Number) {
		this.Number = Number;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublishName() {
		return publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String BookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
}
