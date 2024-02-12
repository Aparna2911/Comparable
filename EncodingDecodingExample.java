package practice;
import java.util.Base64;

public class EncodingDecodingExample {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello, world!";

        // Encoding
        String encodedString = encode(originalString);
        System.out.println("Encoded string: " + encodedString);

        // Decoding
        String decodedString = decode(encodedString);
        System.out.println("Decoded string: " + decodedString);
    }

    // Method to encode a string using Base64
    public static String encode(String originalString) {
        byte[] encodedBytes = Base64.getEncoder().encode(originalString.getBytes());
        return new String(encodedBytes);
    }

    // Method to decode a Base64 encoded string
    public static String decode(String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        return new String(decodedBytes);
    }
}
