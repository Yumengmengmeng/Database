package Book;


public interface bookDao {
	public Book Search(String bookName,String author);
	public void Recommend(String number);
}
