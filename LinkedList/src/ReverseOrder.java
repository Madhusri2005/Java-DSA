import java.util.*;

class LinkedList
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
    void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
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

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter numbers");
        LinkedList ll = new LinkedList();
        for(int i = 0;i < n;i++)
        {
            int val = sc.nextInt();
            ll.insert(val);
        }
        ll.reverse();
        ll.print();
    }
}
