class user{
    public static void main(String[] args) {
        circularLinkedList a = new circularLinkedList();
        // System.out.println(a.name);
        a.add(123);
        a.add(33);
        a.add(44);
        a.add(55);
        // System.out.println(a.size());
        // System.out.println(a.isEmpty());
        // System.err.println(a.contains(9));
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }        
    }
}