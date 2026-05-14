class StackClass{
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmplty(){
            return head==null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmplty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmplty())return -1;
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmplty())return -1;
            return head.data;
        }
    }
    public static void main(String[] args) {
        // Stack s1 = new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        while(!Stack.isEmplty()){
            System.out.println(Stack.pop());
        }
        Stack.push(11);
        Stack.push(22);
        Stack.push(33);
        Stack.push(44);
        while(!Stack.isEmplty()){
            System.out.println(Stack.pop());
        }
    }
}