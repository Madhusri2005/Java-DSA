import java.util.*;
class LinkedList4
{
    Node head;
     void insert(int num)
     {
         Node node = new Node(num);
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
     void print()
     {
         Node temp = head;
         while(temp != null)
         {
             System.out.print(temp.data+" ");
             temp = temp.next;
         }
         System.out.println();
     }
     int middle()
     {
         Node first = head;
         Node second = head;
         while(second != null && second.next != null)
         {
             first = first.next;
             second = second.next.next;
         }
         return first.data;
     }
}
public class FIndMiddleNode {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList4 ll = new LinkedList4();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements: ");
        for(int i = 0;i < n;i++)
        {
            int num = sc.nextInt();
            ll.insert(num);
        }
        ll.print();
        int res = ll.middle();
        System.out.println(res);
    }
}
