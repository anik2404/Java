import java.util.HashMap;
import java.util.Scanner;
public class FirstNonRepeatChr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        HashMap<Character, Integer> countMap = new HashMap<>();
        for(char c: str.toCharArray())
        {
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        } 
        char first= '\0';
        for(char c: str.toCharArray())
        {
            if(countMap.get(c)==1)
            {
                first = c;
                break;
            }
        }
        System.out.println("First non repeating character is: "+first);
    }
}
