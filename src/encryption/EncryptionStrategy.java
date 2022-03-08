package encryption;

/**
 * The interface for the four different encryption algorithms.
 * 
 * @author Hejin
 */
public interface EncryptionStrategy {

	public String encrypt(String plainText, int key);

	public String decrypt(String cipherText, int key);
}
