package HashMap;

import java.util.HashMap;

public class HashMapping {

	public static void main(String[] args) {
		
		
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("Anna12", "password!12");
		hash.put("Jessica2205", "123456");
		hash.put("Robins021", "robinrobin");
		
		System.out.println(hash.get("Anna12"));
		System.out.println(hash.containsValue("123456"));
		System.out.println(hash.replace("Anna12", "password!!1212"));
		System.out.println(hash);
		System.out.println(hash.keySet());
	}

}
