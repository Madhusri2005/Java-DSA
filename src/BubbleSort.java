import java.util.*;
public class BubbleSort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements one by one :");
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++)
        {
            boolean swapping = false;
            for(int j = 0;j < n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapping = true;
                }
            }
            if(!swapping)
            {
                break;
            }
        }
        for(int i = 0;i < n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
