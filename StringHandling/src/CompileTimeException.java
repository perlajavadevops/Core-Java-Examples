import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class CompileTimeException {

	public static void getFile() throws IOException {
		FileInputStream fis = new FileInputStream("demo.txt");//FileNotFoundException
	}
	
	public static void main(String[] args) {
		try {
			getFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
