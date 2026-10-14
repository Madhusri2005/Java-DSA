import java.util.Scanner;
class LinkedList3
{
    Node head;
    void insert(int val)
    {
        Node node = new Node(val);
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    int search(int target)
    {
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            if(temp.data == target)
            {
                count++;
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

}

public class SearchElement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        LinkedList3 ll = new LinkedList3();
        System.out.println("Enter elements: ");
        for(int i = 0;i < n;i++)
        {
            int val = sc.nextInt();
            ll.insert(val);
        }
        System.out.println("Enter the target element to search : ");
        int target = sc.nextInt();
        int index = ll.search(target);
        System.out.println("Index value of target element : "+ index);
    }

}
