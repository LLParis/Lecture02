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
        ArrayList<Integer> list = new ArrayList<>(5);
        // The initial size of the list has been set to 5 by me.
        // The type of elements held within this list is Integers.

        // Put your answer for #4 here:
        // 4. Write code to insert two additional elements, "dark" and "and", at the
        // proper places in the list to produce the following ArrayList as the result:
        // ["It", "was", "a", "dark", "and", "stormy", "night"]

        // Put your answer for #5 here:
        // 5. Write code to change the second element’s value to "IS", producing the
        // following ArrayList as the result:
        // ["It", "IS", "a", "dark", "and", "stormy", "night"]

        // Put your answer for #7 here:
        // 7. Write code to declare an ArrayList holding the first 10 multiples of 2: 0,
        // 2, 4,..., 18. Use a loop to fill the list with the proper elements.

        // Put your answer for #9 here:
        // 9. Write code to print out whether or not a list of Strings contains the
        // value "IS". Do not use a loop.

        // Put your answer for #14 here:
        // 14. What is a wrapper class? Describe the difference between an int and an
        // Integer.

        // Put your answer for #13 here:
        // 13. The code that follows does not compile. Why not? Explain how to fix it.

        // ArrayList<int> numbers = new ArrayList<>();
        // numbers.add(7);
        // numbers.add(19);
        // System.out.println(numbers);

        // Put your answer for #15 here:
        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // A. [2, 6, 1, 8]
        // B. [30, 20, 10, 60, 50, 40]
        // C. [-4, 16, 9, 1, 64, 25, 36, 4, 49]
    }
}
