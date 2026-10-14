import java.util.Scanner;

public class BinarySearch {
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

        int left = 0;
        int right = n-1;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if(arr[mid] == target)
            {
                System.out.println(mid);
                return;
            }
            else if(arr[mid] > target)
            {
                right = mid -1;
            }
            else
            {
                left = mid +1;
            }
        }
        System.out.println("Target Not found!!");
    }
}
