 class user{
    public static void main(String[] args) {
        hashSet a = new hashSet();
        a.add(123);
        a.add(33);
        a.add(44);
        a.add(55);
        a.add(55);
        a.add(55);
        a.add(55);
        a.add(55);
        a.add(55);
        a.add(55);
        // a.remove(123);
        System.err.println(a.size());
        System.err.println(a.isEmpty());
        a.display();       
    }
}