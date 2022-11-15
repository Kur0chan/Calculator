import java.util.Scanner;

public class ConsoleReader {
    public String getExample(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write yor example here: ");
        String example = sc.next();
        sc.close();
        return example;
    }
}
