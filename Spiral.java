import java.util.Scanner;
public class Spiral 
{
    static void print(int [][] arr, int n)
    {
        int top=0, bottom = n-1, left =0, right= n-1;
        while(top<=bottom && left<=right)
        {
            int i;
            for(i=left;i<=right;i++)
            {
                System.out.print(arr[top][i] + "");
                top++;
            }
            for(i=top;i<=bottom;i++)
            {
                System.out.print(arr[i][right] + "");
                right--;
            }
            if(top<=bottom)
            {
                for(i=right;i>=left;i--)
                {
                    System.out.print(arr[bottom][i] + "");
                    bottom--;
                }
            }
            if(left<=right)
            {
                for(i=bottom;i>=top;i--)
                {
                    System.out.print(arr[i][left] + "");
                    left++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int i,j;
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral Matrix: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                    print(arr, n);
            }
            System.out.println(" ");
        }
    }
}
