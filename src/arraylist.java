import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("After addition: "+list);

        //Modify element
        list.set(2,11);
        System.out.println("After Modifying: "+list);

        //size
        int size =list.size();
        System.out.println("The Size of Array is : "+size);

        //Delete element
        list.remove(3);
        System.out.println("After Removing: "+list);

        //checking element
        boolean check = list.contains(2);
        System.out.println("Element present "+check);

        //getting element
        int take=list.get(2);
        System.out.println("element at index 2 : "+take);

        //getting index
        int index = list.indexOf(5);
        System.out.println("Getting index: "+index);

        //checking is list empty or not
        boolean b = list.isEmpty();
        System.out.println("Array Empty: "+list);



        //if an element comes twice, getting its index from last
        list.add(2);
        System.out.println("Last index of element is: "+list.lastIndexOf(2));

        //Reversing list
        System.out.println("After Reversing: "+list.reversed());

        list.trimToSize();

        //Sorting list
        Collections.sort(list);
        System.out.println(list);

        //Removing all elements
        list.clear();
        System.out.println("After clearing QueueByArray: "+list);


    }
}
