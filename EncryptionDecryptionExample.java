package practice;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionDecryptionExample {
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        String secretKey = "ThisIsASecretKey"; // The secret key for encryption and decryption

        // Encrypt the original string
        String encryptedString = encrypt(originalString, secretKey);
        System.out.println("Encrypted string: " + encryptedString);

        // Decrypt the encrypted string
        String decryptedString = decrypt(encryptedString, secretKey);
        System.out.println("Decrypted string: " + decryptedString);
    }

    // Method to encrypt a string using AES encryption algorithm
    public static String encrypt(String originalString, String secretKey) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encryptedBytes = cipher.doFinal(originalString.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to decrypt a string using AES decryption algorithm
    public static String decrypt(String encryptedString, String secretKey) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedString));
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
