import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {
		FileReader reader = null;
		HashSet<String> set = new HashSet<>();
		try {
			reader = new FileReader("C:\\Users\\Сергей\\Desktop\\Some_text.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Такой файл не найден");
		}
		Scanner scan = new Scanner(reader);
		while (scan.hasNextLine()) {
			String s = scan.nextLine();
			for (String str : s.split(" ")) {
				if ((str.charAt(str.length()-1)  == '.') || (str.charAt(str.length()-1)  == ',') || (str.charAt(str.length()-1)  == '\\') || (str.charAt(str.length()-1)  == '-') || (str.charAt(str.length()-1)  == ':') || (str.charAt(str.length()-1)  == ';'))  {
					StringBuffer sb = new StringBuffer(str);
					sb.deleteCharAt(sb.length()-1);
					if (sb.length() > 0) set.add(sb.toString().toLowerCase());
				} else {
					set.add(str.toLowerCase());
				}
		    }
		}
		for (String x : set) {
			System.out.println(x);
		}
		try {
			reader.close();
		} catch (IOException e) {
			System.out.println("Ошибка I/O");
		}
    }
}
