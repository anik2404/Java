import java.util.Scanner;
public class RLC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder encod = new StringBuilder();
        int count=0;
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
            {
                count++;
            }
            else
            {
                encod.append(str.charAt(i-1)).append(count);
            }
        }
        System.out.println("Run Length Encoding:" + encod.toString());
    }
}
