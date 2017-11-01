import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Problem3 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LinkedHashMap<String, Long> resourceAndQuantity = new LinkedHashMap<>();
		String input = reader.readLine();
		ArrayList<String> listOfInputs = new ArrayList<>();
		while (!"stop".equals(input)) {
			listOfInputs.add(input);
			input = reader.readLine();
		}

		for (int i = 1; i < listOfInputs.size(); i += 2) {
			String key = listOfInputs.get(i - 1);
			long value = Long.parseLong(listOfInputs.get(i));
			if (!resourceAndQuantity.containsKey(key)) {
				resourceAndQuantity.put(key, value);
			} else {
				long sum = resourceAndQuantity.get(key) + value;
				resourceAndQuantity.put(key, sum);
			}
		}
		for (String key : resourceAndQuantity.keySet()) {
			System.out.println(key + " -> " + resourceAndQuantity.get(key));

		}
	}
}
