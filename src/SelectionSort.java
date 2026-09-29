import java.util.*;
public class SelectionSort {
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
            int min = i;
            for(int j = i+1;j <n;j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0;i < n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
