package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		Map<Integer, String> persons = new HashMap<Integer, String>();
		persons.put(1, "sudheer");
		persons.put(2, "myra");
		persons.put(3, "nirvana");
		persons.put(4, "chittireddy");

		for (Map.Entry<Integer, String> entry : persons.entrySet()) {
			System.out.println(entry.getKey());

			System.out.println(entry.getValue());
		}
	}

}
