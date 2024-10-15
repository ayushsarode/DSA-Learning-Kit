import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        //'a' + 'b' performs numeric addition on character values (ASCII).
        System.out.println('a' + 'b');


        // OPERATOR OVERLOADING

        // "a" + "b" concatenates the two strings.
        System.out.println("a" + "b");

        //Adds 3 to the ASCII value of 'a' (which is 97), resulting in 100.
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        //integer wwill be converted to integer that will call toString()

        System.out.println("ayush" + new ArrayList<>());


        // System.out.println(new Integer(56) + new ArrayList<>()); this will not work

        //Atleast one object of String is required from all objects

        System.out.println(845 + "" + new ArrayList<>());

    }
}
