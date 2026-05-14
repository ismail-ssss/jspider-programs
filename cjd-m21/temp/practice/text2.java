import java.util.ArrayList;
import java.util.List;

class MyObject {
    private String name;
    
    public MyObject(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

class RegistrationManager {
    // A list to hold all registered objects.
    private List<MyObject> registeredObjects = new ArrayList<>();

    // Method to register a new object.
    public void register(MyObject obj) {
        registeredObjects.add(obj);
        System.out.println("Registered object: " + obj.getName());
    }
    
    // Method to display all registered objects.
    public void printRegisteredObjects() {
        System.out.println("Currently registered objects:");
        for (MyObject obj : registeredObjects) {
            System.out.println("- " + obj.getName());
        }
    }
}

public class RegistrationExample {
    public static void main(String[] args) {
        // Create the registration manager.
        RegistrationManager manager = new RegistrationManager();
        
        // Create some objects.
        MyObject obj1 = new MyObject("Object 1");
        MyObject obj2 = new MyObject("Object 2");
        
        // Register the objects.
        manager.register(obj1);
        manager.register(obj2);
        
        // Print out all registered objects.
        manager.printRegisteredObjects();
    }
}
