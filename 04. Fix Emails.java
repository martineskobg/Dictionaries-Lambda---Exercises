import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Problem4 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LinkedHashMap<String, String> resourceAndQuantity = new LinkedHashMap<>();
		String input = reader.readLine();
		ArrayList<String> listOfInputs = new ArrayList<>();
		while (!"stop".equals(input)) {
			listOfInputs.add(input);
			input = reader.readLine();
		}
		for (int i = 1; i < listOfInputs.size(); i += 2) {
			String key = listOfInputs.get(i - 1);
			String value = listOfInputs.get(i);
			resourceAndQuantity.put(key, value);

		}
		for (String key : resourceAndQuantity.keySet()) {
			if ((!resourceAndQuantity.get(key).contains(".us")) && (!resourceAndQuantity.get(key).contains(".uk"))) {
				System.out.println(key + " -> " + resourceAndQuantity.get(key));
			}
		}
	}
}
