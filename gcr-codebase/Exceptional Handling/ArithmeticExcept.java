
import java.io.File;
import java.io.FileReader;

public class ArithmeticExcept {
    public static void main(String[] args) {
        int a=5/2;
        System.out.println(a);

        File fr=new File("abc");
        try (FileReader fileReader = new FileReader(fr)) {
            // Use the reader here if needed.
            System.out.println(fileReader);
        } catch (java.io.IOException e) {
            System.out.println("Errors here:- ");
            e.printStackTrace();
        }
    }
}
