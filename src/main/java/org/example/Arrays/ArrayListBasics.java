import java.util.ArrayList;

class ArrayListBasics{
    public static void main(String[] args) {
        // Creating an ArrayList
        // Wrapper Class is used to store primitive data types in ArrayList
        // Important methods of ArrayList: add(), remove(), get(), set(), size(), clear(), contains(), indexOf(), lastIndexOf() and isEmpty() etc.
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Empty ArrayList: \n" + list);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("\nArrayList: \n" + list);

        // get method
        System.out.println("\nElement at index 2: " + list.get(2));

        // set method
        System.out.println("\nSetting element at index 2 to 100");
        System.out.println("Before: "+ list);
        list.set(2,100);
        System.out.println("After: " + list);

        // remove method
        System.out.println("\nRemoving element at index 2");
        System.out.println("Before: "+ list);
        list.remove(2);
        System.out.println("After: " + list);


        // size method
        System.out.println("\nSize of ArrayList: " + list.size());

        // clear method
        System.out.println("\nClearing ArrayList");
        System.out.println("Before: "+ list);
        list.clear();
        System.out.println("After: " + list);

        // isEmpty method
        System.out.println("Is ArrayList empty: " + list.isEmpty());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("After Adding Elements In ArrayList: " + list);
        System.out.println("Is ArrayList empty: " + list.isEmpty());

        // contains method
        System.out.println("\nArrayList: " + list);
        System.out.println("Is 20 present in ArrayList: " + list.contains(20));
        System.out.println("Is 200 present in ArrayList: " + list.contains(200));

        // indexOf method
        System.out.println("\nArrayList: " + list);
        System.out.println("Index of 20: " + list.indexOf(20));
        System.out.println("Index of 200: " + list.indexOf(200));

        // lastIndexOf method
        list.add(20);
        System.out.println("\nArrayList: " + list);
        System.out.println("Last Index of 20: " + list.lastIndexOf(20));
        System.out.println("Last Index of 200: " + list.lastIndexOf(200));


        // ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Doe");
        names.add("Jane");
        names.add("Doe");
        System.out.println("\nArrayList of Strings: " + names);
        System.out.println("Index of Doe: " + names.indexOf("Doe"));

    }
}