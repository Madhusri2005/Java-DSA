import java.util.*;
class LinkedList5
{
    Node head;
    void insert(int num)
    {
        Node node = new Node(num);
        if(head == null)
        {
            head = node;
        }
        else {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    int findNode(int index,int n)
    {
         int count = n;
         Node temp = head;
         while(temp != null && count != index)
         {
             temp = temp.next;
             count--;
         }
         return temp.data;
    }
}
public class NthFromEnd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList5 ll = new LinkedList5();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements: ");
        for(int i = 0;i < n;i++)
        {
            int num = sc.nextInt();
            ll.insert(num);
        }
        int i = sc.nextInt();
        if(i > n && i <= 0)
        {
            System.out.println("-1");
        }
        else {
            int res = ll.findNode(i, n);
            System.out.println(res);
        }
    }
}
