package encryption;

/**
 * Copies the passed-in text and implements the methods of the
 * EncryptionStrategy interface.
 * 
 * @author Hejin
 */
public class Copy implements EncryptionStrategy {

	public String encrypt(String plainText, int key) {
		return plainText;
	}

	public String decrypt(String cipherText, int key) {
		return cipherText;
	}

}
