package Reader;

public class Reader {
	
	
	private String readerNo;//±‡∫≈
	private String readerName;//”√ªß√˚
	private String readerSex;
	private long tel;
	private String department;
	private String ClassN;
	private String password;//√‹¬Î
	
	
	public Reader() {
		super();	// TODO Auto-generated constructor stub
	}

	public Reader(String readerNo, String password) {
		super();
		this.readerNo = readerNo;
		this.password = password;
	}
	public Reader(long tel, String password) {
		super();
		this.tel = tel;
		this.password = password;
	}

	public void setReaderNo(String readerNo) {
		this.readerNo = readerNo;
	}
	public String getReaderNo() {
		return readerNo;
	}
    
	public String getReaderName() {
		return readerName;
	}
	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getReaderSex() {
		return readerSex;
	}
	public void setReaderSex(String readerSex) {
		this.readerSex = readerSex;
	}
	
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getClassN() {
		return ClassN;
	}
	public void setClassNo(String ClassN) {
		this.ClassN = ClassN;
	}
}
