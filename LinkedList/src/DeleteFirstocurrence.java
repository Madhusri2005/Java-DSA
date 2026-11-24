import java.util.*;
class LinkedList7
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
            temp.next =node;
        }
    }
    void deleteNum(int num)
    {
        Node temp = head;
        while(temp.next != null && temp.next.data != num)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
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


}
public class DeleteFirstocurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        LinkedList7 ll = new LinkedList7();
        System.out.println("Enter elements: ");
        for(int i = 0;i < n;i++)
        {
            int num = sc.nextInt();
            ll.insert(num);
        }
        ll.print();
        System.out.println("Enter the value for deleting its first occurrence: ");
        int val = sc.nextInt();
        ll.deleteNum(val);
        ll.print();

    }
}
