import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements one by one :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, arr.length - 1);
        for(int i = 0;i < n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right)
    {
        int i = left;
        int j = mid +1;
        int k = 0;
        int[] temp = new int[right-left+1];
        while(i <= mid && j <= right)
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int index = 0;index < temp.length;index++)
        {
            arr[left+index] = temp[index];
        }

    }

}
