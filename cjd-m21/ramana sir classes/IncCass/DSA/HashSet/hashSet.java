
class hashSet {

    int count;
    Node[] a = new Node[10];

    public boolean add(Object ele) {
        int hc = Math.abs(ele.hashCode());
        int index = hc % a.length;
        if (a[index] == null) {
            a[index] = new Node(ele);
            count++;
            return true;
        }
        Node curr = a[index];
        Node temp = null;
        while (curr != null) {
            if (curr.ele.equals(ele)) {
                return false;
            }
            temp = curr;
            curr = curr.next;
        }
        temp.next = new Node(ele);
        count++;
        return true;
    }

    public int size(){return count;}
    public boolean isEmpty(){return count==0;}

    public void display(){
        for (Node curr : a) {
            while(curr != null){
                System.out.println(curr.ele);
                curr=curr.next;
            }
        }
    }
    public void remove(Object ele){
        for (Node curr : a) {
            Node prev = curr;
            while(curr != null){
                if(curr.ele.equals(ele)){
                    curr = curr.next;
                }
                curr=curr.next;
            }
        }
    }
}
