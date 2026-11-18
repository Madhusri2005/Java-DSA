import java.util.*;
class LinkedList6{
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
    void insertAtPos(int data, int i)
    {
        Node node = new Node(data);
        Node temp = head;
        int count = 1;
        while(temp.next != null && count != i)
        {
            count++;
            temp = temp.next;
        }
        Node curr = temp.next;
        temp.next = node;
        node.next = curr;



    }
    void print()
    {
        Node temp = head;
        while(temp  != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class InsertAtPos {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList6 ll = new LinkedList6();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i = 0;i < n;i++)
        {
            int num = sc.nextInt();
            ll.insert(num);
        }
        ll.print();
        System.out.println("Enter new element");
        int data = sc.nextInt();
        System.out.println("Enter position: ");
        int pos = sc.nextInt();
        ll.insertAtPos(data,pos);
        ll.print();

    }

}
