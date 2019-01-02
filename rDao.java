package Reader;
import java.sql.*;

public interface rDao {
	public Reader login(Reader reader);
	public boolean check(String readerNo);
	public void printReader(Reader reader);
}
