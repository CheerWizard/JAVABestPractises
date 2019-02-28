import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public static void main(String [] args) {
//		read();
//		write("File is updated");
	}
	/**read file*/
	private static void read() {
		StringBuilder stringBuilder = new StringBuilder();
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			 fileReader = new FileReader("D:\\testout.txt");
			 bufferedReader = new BufferedReader(fileReader);
			 String string = null;
			 while ((string = bufferedReader.readLine()) != null) stringBuilder.append(string);
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
				System.out.println(stringBuilder.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**write file (only string content)*/
	private static void write(String content) {
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			 fileWriter = new FileWriter("D:\\testout.txt");
			 bufferedWriter = new BufferedWriter(fileWriter);
			 bufferedWriter.write(content);
			 System.out.println("Written successfully!");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
