package Encryption;

public class Encrypt {

	public static void main(String[] args) {
		
		int key = 6;
		
		String text ="Hello world";
		System.out.println(text);
		
		char[] chars = text.toCharArray();
		for(char c : chars) {
			c += key;
			System.out.print(c);
		}
	}

}

//Decryption works just the over way around