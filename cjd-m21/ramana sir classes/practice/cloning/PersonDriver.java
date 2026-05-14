public class PersonDriver{
        public static void main(String[] args) {
            try {
                Address ad = new Address("India","Benglure");
                Person p1 = new Person("Anagram",24,ad);
                Person p2 = (Person) p1.clone();
                System.err.println(p1);
                System.err.println(p2);
                p2.address.city = "hubli";
                System.err.println(p1);
                System.err.println(p2);
            } catch (CloneNotSupportedException ex) {
            }
        }
    }