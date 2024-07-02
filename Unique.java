import java.util.HashSet;
import java.util.Scanner;
public class Unique {
    public static void main(String args [])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        boolean hasUnique = true;
        for(char c: str.toCharArray())
        {
            if(set.contains(c))
            {
                hasUnique = false;
                break;
            }
            set.add(c);
        }
        System.out.println("Contains Only Unique Characters: " + hasUnique);
    }
    }
