package day21_multidimensionalArray;

public class PrintEachElement {
    public static void main(String[] args) {

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};   // 10D
 //
        for (String[][][][][][][][][] arr1 : array) {           // 9D
            for (String[][][][][][][][] arr2 : arr1) {         // 8D
                for (String[][][][][][][] arr3 : arr2) {
                    for (String[][][][][][] arr4 : arr3) {
                        for (String[][][][][] arr5 : arr4) {
                            for (String[][][][] arr6 : arr5) {
                                for (String[][][] arr7 : arr6) {
                                    for (String[][] arr8 : arr7) {
                                        for (String[] arr9 : arr8) {
                                            for (String arr10 : arr9) {
                                                System.out.println(arr10);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }
}
/*
3. Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can dispay each elements of the given array
 */