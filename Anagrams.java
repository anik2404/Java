import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {
    public static void main(String args [])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the 1st String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the 2nd String: ");
        String s2 = sc.nextLine();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAnagram = Arrays.equals(arr1,arr2);
        System.out.println("Are Anagrams: " + isAnagram);
    }
}
