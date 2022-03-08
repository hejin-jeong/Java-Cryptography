package encryption;

/**
 * Conducts the Reverse Caesar cipher and implements the methods of the
 * EncryptionStrategy interface.
 * 
 * @author Hejin
 */
public class ReverseCaesar implements EncryptionStrategy {

	/**
	 * Encrypts the text by first reversing the text and then applying caesar on the
	 * reversed text.
	 * 
	 * @param plainText the text that needs to be encrypted
	 * @param key       the number that the text needs to be shifted by
	 * @return the encrypted text
	 */
	public String encrypt(String plainText, int key) {

		String reversedText = "";
		String encryptedText = "";

		// Reverses the passed-in text
		int i = plainText.length() - 1;
		while (i >= 0) {
			reversedText += plainText.charAt(i);
			i--;
		}

		// Shifts each letter of the reversed text by the amount of key
		for (int j = 0; j < reversedText.length(); j++) {
			int ascii = reversedText.charAt(j);
			int newAscii = (ascii + key) % 256;
			encryptedText += Character.toString((char) newAscii);
		}

		return encryptedText;
	}

	/**
	 * Decrypts the text by first applying caesar and then reversing the text.
	 * 
	 * @param plainText the text that needs to be decrypted
	 * @param key       the number that the text needs to be shifted by
	 * @return the decrypted text
	 */
	public String decrypt(String cipherText, int key) {

		String reversedText = "";
		String decryptedText = "";

		// Shifts each letter of the passed-in text back by the amount of key
		for (int j = 0; j < cipherText.length(); j++) {
			int ascii = cipherText.charAt(j);
			int newAscii = ascii - key;
			if (newAscii < 0) {
				newAscii += 256;
			}
			reversedText += Character.toString((char) newAscii);
		}

		// Reverses the shifted text
		int i = reversedText.length() - 1;
		while (i >= 0) {
			decryptedText += reversedText.charAt(i);
			i--;
		}

		return decryptedText;
	}

}