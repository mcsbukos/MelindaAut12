package w3resource.HashList;

import java.util.HashSet;

public class Example1 {
    public static void main(String[] args) {
        HashSet<String> h_Set = new HashSet<String>();
        h_Set.add("Red");
        h_Set.add("green");
        h_Set.add("blue");
        System.out.println("The Hash_Set: " + h_Set);
        h_Set.remove("green");
        System.out.println("The Hash_Set, after deleting Green: " + h_Set);

    }

}
