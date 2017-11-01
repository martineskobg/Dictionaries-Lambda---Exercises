import java.util.*;
import java.util.HashMap;
import java.io.*;

public class Problem2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String, String> phoneBook = new TreeMap<>();
		String input = reader.readLine();

		while (!"END".equals(input)) {

			String[] phonoParameters = input.split("\\s+");
			String command = phonoParameters[0];

			if ("A".equals(command)) {
				String key = phonoParameters[1];
				String value = phonoParameters[2];
				phoneBook.put(key, value);
			}else if ("ListAll".equals(command)) {
				phoneBook.forEach((key1, value) -> System.out.println(String.format("%s -> %s", key1, value)));

			}  else {
				String key = phonoParameters[1];
				if (phoneBook.containsKey(key)) {
					System.out.println(String.format("%s -> %s", key, phoneBook.get(key)));
				} else {
					System.out.println(String.format("Contact %s does not exist.", key));
				}
			}
			input = reader.readLine();
		}

	}

}
