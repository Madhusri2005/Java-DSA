import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elemeents");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements");
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target:");
        int target = sc.nextInt();
        for(int i = 0;i < n;i++)
        {
            if(arr[i] == target)
            {
                System.out.println("Target Found!!"+i);
                return;
            }
        }
        System.out.println("Target not found!!");
    }
}
