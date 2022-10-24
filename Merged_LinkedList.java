class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
   
}
class Merged_LinkedList
{
    Node head = null;
    void add_beg(int data)
    {
        Node node = new Node(data);
        if(head == null) head = node;
        else
        {
            node.next = head;
            head = node;
        }
    }
    void add_end(int data)
    {
        Node node = new Node(data);
        if(head == null) head = node;
        else
        {
            Node temp =head;
            while(temp.next != null)
            {
                temp =  temp.next;  
            }
            temp.next = node;
        }
    }
    void show()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println("Elements: "+temp.data);
            temp = temp.next;
        }
    }
    void merge(Node h1,Node h2)
    {
        Node temp = h1;
        while(temp.next!=null) 
        {
            temp = temp.next;
        }
        temp.next = h2 ;
    }

    public static void main(String arg[])
    {
        Merged_LinkedList d1,d2;
        d1 = new Merged_LinkedList();
        d2 = new Merged_LinkedList();
        d1.add_beg(2);
        d1.add_beg(3);
        d1.add_beg(6);
        System.out.println("LIst 1");
        d1.show();
        
        System.out.println("LIst 2: ");
        
        d2.add_end(8);
        d2.add_end(9);
        d2.add_end(11);
        d2.show();
        d2.merge(d1.head,d2.head);
        System.out.println("Merged List");
        d1.show();
    }
}