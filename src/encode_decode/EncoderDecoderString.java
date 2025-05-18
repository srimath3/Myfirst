package encode_decode;

import java.util.Base64;

public class EncoderDecoderString {
	public static void main(String[] args) {
		String originalInput = "test input";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		String decodedUrl = new String(decodedBytes);
		System.out.println(encodedString);
		System.out.println(decodedUrl);
		
	}
	
	

}
