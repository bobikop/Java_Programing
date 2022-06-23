package day22_arrayListIntro;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        numbers.add(3,255);
        System.out.println(numbers);

        System.out.println("-------------------------------------------------");


        for(int i = 0; i < numbers.size(); i++) {
            int each = numbers.get(i);
            System.out.println(each);
        }

    }
}
