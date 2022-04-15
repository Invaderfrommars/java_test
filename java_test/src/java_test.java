import java.util.Scanner;
import java.util.Arrays;
public class java_test {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.print("Enter the length of array: ");
            int n = console.nextInt();
            String[] arr = new String[n];
            System.out.println(arr.length);
            System.out.println("Now please write " + arr.length + " strings, after each string you should press ENTER");
            for (int i = 0; i < n; i++) {
                arr[i] = console.nextLine();
            }
            for (int i = n-1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

