/**
 * Class to demonstrate  Ceasar Cipher as below
 *Encryption code = DEFGHIJKLMNOPQRSTUVWXYZABC
 *Decryption code = XYZABCDEFGHIJKLMNOPQRSTUVW
 *Secet: WKH HDJOH LV LQ SODB; PHHW DW MRH�V.
 *Message: THE EAGLE IS IN PLAY; MEET AT JOE�S.
 */
public class CeaserCipher {

	protected char[] encoder = new char[26]; // Encryption array
	protected char[] decoder = new char[26]; // Decryption array

	/** Constructor that initializes the encryption and decryption arrays */
	public CeaserCipher(int rotation) {
		for (int k = 0; k < 26; k++) {
			encoder[k] = (char) ('A' + (k + rotation) % 26);
			decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
		}
	}// end constructor

	/** Returns String representing encrypted message. */
	public String encrypt(String message) {
		return transform(message, encoder); 		// use encoder array
	}

	/** Returns decrypted message given encrypted secret. */
	public String decrypt(String secret) {
		return transform(secret, decoder); // use decoder array
	}

	/** Returns transformation of original String using given code. */
	private String transform(String original, char[] code) {
		char[] msg = original.toCharArray();
		for (int k = 0; k < msg.length; k++)
			if (Character.isUpperCase(msg[k])) { 		// we have a letter to change
				int j = msg[k] - 'A'; 					// will be value from 0 to 25
				msg[k] = code[j]; 						// replace the character
			}
		return new String(msg);
	}

	public static void main(String[] args) {
		CeaserCipher cipher = new CeaserCipher(3);
		System.out.println("Encryption code = " + new String(cipher.encoder));
		System.out.println("Decryption code = " + new String(cipher.decoder));
		String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
		String coded = cipher.encrypt(message);
		System.out.println("Secret: " + coded);
		String answer = cipher.decrypt(coded);
		System.out.println("Message: " + answer); 		// should be plaintext again

	}// end class

}// end class
