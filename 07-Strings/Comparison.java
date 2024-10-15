public class Comparison {

    public static void main(String[] args) {

        String name1 = "ayush";
        String name2= "ayush";

        System.out.println(name1 == name2); //true


        ///creating diff object of same value 
        String a = new String("john");
        String b = new String("john");
        String c = a;
        // System.out.println(a == b);
        //same 
        System.out.println(c == b); //false


        // in this it doesn't care about ref var is pointing towards same object or not, it just car about the same values
        System.out.println(a.equals(b)); // true


        //index for the string
        System.out.println(name1.charAt(0));
        System.out.println();
    }
}