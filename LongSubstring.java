import java.util.HashSet;
import java.util.Scanner;
public class LongSubstring {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String longest = "";
        for(int i=0;i<str.length();i++)
        {
            HashSet<Character> seen =new HashSet<>();
            String current="";
            for(int j=i;j<str.length();j++)
            {
                if(seen.contains(str.charAt(j)))
                {
                    break;
                }
                seen.add(str.charAt(j));
                current+=str.charAt(j);
            }
            if(current.length()>longest.length())
            {
                longest=current;
            }
        }
        System.out.println("Longest substring without repeating characters: "+ longest);
    }
}
