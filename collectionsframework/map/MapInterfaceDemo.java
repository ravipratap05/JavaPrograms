// This is the introduction about the map..

package collectionsframework.map;

import java.util.*;

class MapIntroduction {
    // declare the map interface by using the implementation of its classes.
    Map<Integer, String> map = new HashMap<>();

    void addEntry() {
        // entry will be added in the form of key-value pair.
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");
        System.out.println("\nEntry in the map are : ");
        System.out.println(map);
    }

    void putAllMethod() {
        Map<Integer, String> anotherMap = new LinkedHashMap<>();
        anotherMap.put(401, "Dave");
        anotherMap.put(501, "Eve");
        anotherMap.put(106, null);
        map.putAll(anotherMap); // adding another collection but not maintained the order
        System.out.println("\nAnother map entries are added successfully.");
        System.out.println("Combined map is : " + map);
    }

    void putIfAbsentMethod() {
        map.putIfAbsent(106, "Update");
        System.out.println("\nThe value check and updated : " + map);
    }

    void removeEntry() {
        map.remove(102);
        System.out.println("\nAfter removing the entry where key is 102 : " + map);
        map.remove(106, "Update");
        System.out.println("After removing with a specific value : " + map);
    }

    void keySetMethod() {
        Set<Integer> keys = map.keySet();
        System.out.println("\nKeys in the map are : \n" + keys);
    }

    void entrySetMethod() {
        Set<Map.Entry<Integer, String>> entry = map.entrySet();
        System.out.println("\nKeys in the map are : \n" + entry);
    }

    void computeMethod() {
        String result = map.compute(101, (key, value) -> value = value + " Updated");
        System.out.println(map);
        System.out.println(result);
        System.out.println("\nCompute if Present :");
        String result1 = map.computeIfPresent(103, (key, value) -> value = "Computing Done");
        System.out.println(map);
        System.out.println(result1);
        // System.out.println("\nCompute if Absent :");
        // map.put(1, null);
        // String result2 = map.computeIfAbsent(1, (key, value) -> "New value");
    }

    void containValueMethod() {
        map.containsKey(101);
        map.containsValue("Alice");
        System.out.println("\nMap contain key 101 and value Alice.");
    }

    void getOrDefaultMethod() {

        System.out.println(map.getOrDefault(101, "Ravi"));
    }

}

public class MapInterfaceDemo {
    public static void main(String[] args) {

        // intialize the object for accessing the method of subclass.
        MapIntroduction mI = new MapIntroduction();
        // calling the method to add entries into the map.
        mI.addEntry();
        mI.putAllMethod();
        mI.putIfAbsentMethod();
        mI.removeEntry();
        mI.computeMethod();
        mI.containValueMethod();
        mI.getOrDefaultMethod();
    }
}
