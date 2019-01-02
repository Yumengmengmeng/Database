package BookType;
import Book.Book;

public class BookType {
	private String classNo;
	private String className;
	private String classInf;
	
	BookType()
	{
		Book book;
	}
	BookType(String classNo,String className,String classInf)
	{
		this.classNo=classNo;
		this.className=className;
		this.classInf=classInf;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getClassNo() {
		return classNo;
	} 
	
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassName() {
		return className;
	}
	public void setClassInf(String classInf) {
		this.classInf = classInf;
	}
	public String getClassInf() {
		return classInf;
	}

}
