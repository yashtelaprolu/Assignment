package java18_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffleArray {
    public static void main(String[] args) {
       
        List<Integer> Arraylist = new ArrayList<>();
        Arraylist.add(1);
        Arraylist.add(2);
        Arraylist.add(3);
        Arraylist.add(4);
        Arraylist.add(5);
        Arraylist.add(6);
        Arraylist.add(7);
        Collections.shuffle(Arraylist);
        
        Integer[] shuffledArray = Arraylist.toArray(new Integer[0]);
        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}

