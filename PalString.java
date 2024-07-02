import java.util.Scanner;
public class PalString{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        boolean isPal = true;
        int l = str.length();
        for(int i=0;i<l/2;i++){
            if(str.charAt(i) != str.charAt(l-i-1))
            {
                isPal = false;
                break;
            }
        }
        System.out.println(str + "is Palindrome String:" + isPal);
    }
}