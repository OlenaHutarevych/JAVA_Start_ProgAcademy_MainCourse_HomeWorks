package jbadvanced;
import java.util.HashMap; // import the HashMap class

public class BinaryTree {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }

    public static void binaryTree(String[] args) {
        HashMap<String, Integer> binary_tree = new HashMap<String, Integer>();
        binary_tree.put("parent",8);
        Integer right = binary_tree.put("right", 10);
        binary_tree.put("left",3);
        binary_tree.put("right", 6);
        binary_tree.put("left",1);
        binary_tree.put("right", 14);
        binary_tree.put("right", 7);
        binary_tree.put("left",4);
        binary_tree.put("left",13);
    }

}
