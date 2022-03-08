package encryption;

/**
 * Conducts the Scytale cipher and implements the methods of the
 * EncryptionStrategy interface.
 * 
 * @author Hejin
 */
public class Scytale implements EncryptionStrategy {

	/**
	 * Encrypts the text by writing the letters in rows with a fixed number of
	 * columns and reading it vertically
	 * 
	 * @param plainText the text that needs to be encrypted
	 * @param key       the number of the columns
	 * @return the encrypted text
	 */
	public String encrypt(String plainText, int key) {

		String encryptedText = "";

		for (int i = 0; i < key; i++) {
			int count = 0;
			int j = i;
			while (count <= (int) (plainText.length() / key) && j < plainText.length()) {
				encryptedText += plainText.charAt(j);
				j += key;
				count++;
			}

			// Space in the last row
			if (count <= (int) (plainText.length() / key)) {
				encryptedText += " ";
			}
		}

		return encryptedText;
	}

	/**
	 * Decrypts the text that was encrypted by the Scytale cipher
	 * 
	 * @param plainText the text that needs to be decrypted
	 * @param key       the number of the columns that is used for encrypting the
	 *                  text
	 * @return the decrypted text
	 */
	public String decrypt(String cipherText, int key) {

		String decryptedText = "";

		int rows = cipherText.length() / key;
		for (int i = 0; i < rows; i++) {
			for (int j = i; j < cipherText.length(); j += rows) {
				decryptedText += cipherText.charAt(j);
			}
		}

		// Return by trimming the white space at the right end
		return decryptedText.replaceAll("\\s+$", "");
	}

}
