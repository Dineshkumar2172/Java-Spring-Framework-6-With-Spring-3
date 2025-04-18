// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderAndScanner {
    public static void main(String[] args) throws IOException{

        // Println belongs to a PrintStream class whose object is declared as a static inside System Class to "in".
        // System.out.println("Enter a number");
        // int input = System.in.read(); // this one takes ascii and assigns it to input
        // System.out.println(input);

        // // to get actual input from user insteaf of ASCII
        // InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        // BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // System.out.println("Enter a number");
        // int num = Integer.parseInt(bufferedReader.readLine());
        // System.out.println(num);
        // // while calling a bufferedReader, we are opening a file or some resource for it.
        // bufferedReader.close(); // we need to close the resource we opened
        
        System.out.println("please enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); // we don't have worry about explicity converting string to int
        System.out.println(num1);
        scanner.close();
    }
}
