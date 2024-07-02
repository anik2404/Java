import java.util.Scanner;
public class Concat {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        String s3 = s1.concat(s2);
        System.err.println("Concatenated String: "+ s3);
    }
}
