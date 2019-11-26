import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader3000 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//import java.io.File("裡面要有地址")
		//讀檔案
		File file = new File("/Users/chienlin/Desktop/test.txt");
		//scanner會有exception要filenotfound exception
		Scanner scan = new Scanner(file);
		//讀出一行
		String fileContent = "";
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		//印出好幾行while
		}
		//要寫東西到新檔案
		FileWriter writer = new FileWriter("/Users/chienlin/Desktop/newfile.txt");
		writer.write(fileContent);
		writer.close();
	}

}
