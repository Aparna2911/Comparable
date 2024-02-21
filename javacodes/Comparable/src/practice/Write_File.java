package practice;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Write_File  {
    public static void main(String[] args) throws IOException{
    	String file = "C:/Users/Aparna/Desktop/output.txt";

        // Content to be written
        List<String> content = Arrays.asList("Address", "Phone No");
        

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
        	
            for (String line : content) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File has been written.");
        } catch (IOException e) {
            System.err.println("Error occurred : " + e.getMessage());
        }
    }
}
