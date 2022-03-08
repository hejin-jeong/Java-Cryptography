package encryption;

/**
 * Conducts the Caesar cipher and implements the methods of the
 * EncryptionStrategy interface.
 * 
 * @author Hejin
 */
public class Caesar implements EncryptionStrategy {

	/**
	 * Encrypts the text by shifting each letter by the amount of key
	 * 
	 * @param plainText the text that needs to be encrypted
	 * @param key       the number that the text needs to be shifted by
	 * @return the encrypted text
	 */
	public String encrypt(String plainText, int key) {

		String encryptedText = "";

		// Shifts each letter of the passed-in text by the amount of key
		for (int i = 0; i < plainText.length(); i++) {
			int ascii = plainText.charAt(i);
			int newAscii = (ascii + key) % 256;
			encryptedText += Character.toString((char) newAscii);
		}

		return encryptedText;
	}

	/**
	 * Decrypts the text by shifting it back by the amount of key
	 * 
	 * @param cipherText the text that needs to be decrypted
	 * @param key        the number that the text needs to be shifted back by
	 * @return the decrypted text
	 */
	public String decrypt(String cipherText, int key) {

		String decryptedText = "";

		// Shifts each letter of the passed-in text back by the amount of key
		for (int i = 0; i < cipherText.length(); i++) {
			int ascii = cipherText.charAt(i);
			int newAscii = ascii - key;
			if (newAscii < 0) {
				newAscii += 256;
			}
			decryptedText += Character.toString((char) newAscii);
		}

		return decryptedText;
	}

}