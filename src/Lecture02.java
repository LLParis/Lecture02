import java.util.*;

class Lecture02 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 02");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        // 1. What is an ArrayList? In what cases should you use an ArrayList rather
        // than an array?
        // An ArrayList is an adaptable data structure that has the ability to resize itself to accommodate more or less elements.
        // You should use an ArrayList rather than an array when the number of elements that you are containing is dynamic

        // Put your answer for #3 here:
        // 3. Write the code to declare an ArrayList containing these elements. What is
        // the size of the list? What is its type?
        ArrayList<String> words = new ArrayList<>();
        words.add("It");
        words.add("was");
        words.add("a");
        words.add("stormy");
        words.add("night");

        System.out.println(words);
        // The size of the list is 5.
        // The type of element held within this list is String.

        // Put your answer for #4 here:
        // 4. Write code to insert two additional elements, "dark" and "and", at the
        // proper places in the list to produce the following ArrayList as the result:
        // ["It", "was", "a", "dark", "and", "stormy", "night"]
        words.add(3, "dark");
        words.add(4, "and");
        System.out.println(words);

        // Put your answer for #5 here:
        // 5. Write code to change the second element’s value to "IS", producing the
        // following ArrayList as the result:
        // ["It", "IS", "a", "dark", "and", "stormy", "night"]
        words.remove(1);
        words.add(1, "IS");
        System.out.println(words + "\n");

        // Put your answer for #7 here:
        // 7. Write code to declare an ArrayList holding the first 10 multiples of 2: 0,
        // 2, 4,..., 18. Use a loop to fill the list with the proper elements.
        int initialCapacity = 10;
        ArrayList<Integer> list = new ArrayList<>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++) {
            list.add(i * 2);
        }
        System.out.println(list + "\n");

        // Put your answer for #9 here:
        // 9. Write code to print out whether or not a list of Strings contains the
        // value "IS". Do not use a loop.

        while (!words.isEmpty()) {
            if (words.contains("IS")) {
                System.out.println("This list of strings contains \"IS\"");
            } else {
                System.out.println("This list of strings does not contain \"IS\"");
            }
            break;
        }

        // Put your answer for #14 here:
        // 14. What is a wrapper class? Describe the difference between an int and an
        // Integer.
        // Wrapper class: A class that encapsulates "wraps" (stores) primitive data as an object.
        // The differences between int and Integer are, int is a primitive data type which is not an object.
        // Integer is a class that wraps around int, allowing it to be used as an object.

        // Put your answer for #13 here:
        // 13. The code that follows does not compile. Why not? Explain how to fix it.

        // ArrayList<int> numbers = new ArrayList<>();
        // numbers.add(7);
        // numbers.add(19);
        // System.out.println(numbers);

        // This code does not work because Java Collections such as ArrayLists or HashMaps cannot directly utilize primitive data.
        // Instead, the data must be encapsulated within a Wrapper class that will allow it to be utilized as on object.

        // Put your answer for #15 here:
        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // A. [2, 6, 1, 8]
        //    [1, 2, 6, 8]
        //    [1, 2, 6, 8]

        // B. [40, 30, 20, 10, 60, 50]
        //    [40, 30, 20, 10, 60, 50]
        //    [10, 40, 30, 20,  60, 50]
        //    [30, 10, 40, 20,  60, 50]
        //    [10, 30, 40, 20,  60, 50]

        // C. [-4, 16, 9, 1, 64, 25, 36, 4, 49']
        //    [4, -4, 16, 9, 1, 64, 25, 36', 49]
        //    [25, 4, -4, 16, 9, 1, 64', 36, 49]
        //    [1, 25, 4, -4, 16, 9', 64', 36, 49]
        //    [1, 25, 4, -4, 16', 9, 64', 36, 49]
        //    [-4, 1, 25, 4', 16, 9, 64', 36, 49]
        //    [-4, 1, 25', 4, 16, 9, 64', 36, 49]
        //    [-4, 1', 25, 4, 16, 9, 64', 36, 49]


        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 6, 1, 8));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(30, 20, 10, 60, 50, 40));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(-4, 16, 9, 1, 64, 25, 36, 4, 49));
        mystery1(list2);
        mystery1(list3);
        mystery1(list4);


    }
    public static void mystery1(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) < list.get(i - 1)) {
                int element = list.get(i);
                list.remove(i);
                list.add(0, element);
            }
            System.out.println(list);
        }
    }

}
