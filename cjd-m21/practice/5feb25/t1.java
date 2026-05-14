public class t1 {
    public static void main(String[] args) {
        // Create the registration manager.
        t3 manager = new t3();
        
        // Create some objects.
        t2 obj1 = new t2("Object 1");
        t2 obj2 = new t2("Object 2");
        
        // Register the objects.
        manager.register(obj1);
        manager.register(obj2);
        
        // Print out all registered objects.
        manager.printRegisteredObjects();
    }
}
