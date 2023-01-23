import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /* Terminal:  C:\\Users\\user> New-Item -path .\file.txt -value 'Hello World!' */

        File file = new File("C:\\Users\\user\\file.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Have a good day!" + " ");
        writer.write("Mighty Java programmer!");

        writer.close();

        FileWriter writer1 = new FileWriter(file, true);
        writer1.write("\nThank you!");
        writer1.close();
        File file1 = new File("C:\\Users\\User\\file.txt");
        try (FileWriter writer3 = new FileWriter(file1,true)) {
            writer3.write("\nHello!");
        } catch (IOException exception) {
            System.out.println(exception.getCause());
        }
        // cat file.txt
    }
}
