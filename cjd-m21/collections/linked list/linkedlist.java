class linkedlist {

    Node head;
    private int size;
    class Node {

        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node last2 = head;
        Node last1 = head.next;
        while (last1.next != null) {
            last1 = last1.next;
            last2 = last2.next;
        }
        last2.next = null;
    }

    public void deleteAll(){
        if(head==null){
            System.err.println("list is empty");
            return;
        }
        head = null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if(head==null||head.next==null)return;
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursion(Node head){
        if(head==null||head.next==null)return head;
        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void PrintList() {
        if (head == null) {
            System.err.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addFirst("c");
        list.addFirst("b");
        list.addFirst("a");
        list.addLast("y");
        list.addLast("z");
        list.PrintList();
        list.head = list.reverseRecursion(list.head);
        // System.out.println(n);
        // list.reverseIterate();
        list.PrintList();
        list.deleteFirst();
        list.PrintList();
        list.deleteLast();
        list.PrintList();
        System.err.println(list.size);
        list.deleteAll();
        list.PrintList();
    }
}
