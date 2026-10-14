import java.util.*;
class LinkedList2
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
    int count()
    {
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }
    void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

}

public class CountNodes {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        LinkedList2 ll = new LinkedList2();
        System.out.println("Enter elements: ");
        for(int i = 0;i < n;i++)
        {
            int val = sc.nextInt();
            ll.insert(val);
        }
        int total = ll.count();
        System.out.println("Total number of nodes: "+total);

    }

}
