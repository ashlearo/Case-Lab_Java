    public static Node reverse(Node head)
    {
        Node previous = null;
        Node current = head;
        while (current != null)
        {
            Node next = current.next; 
            current.next = previous;     
            previous = current;
            current = next;
        }
        return previous;
    }
