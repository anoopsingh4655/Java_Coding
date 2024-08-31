package Concepts.ObjectComparision.ShollowComparision;

public class ShallowComparision {

    public static void main(String[] args){

        String str1 = new String("Anoop");
        String str2 = new String("Anoop");
        String str3 = str1;

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println("String str1 " + System.identityHashCode(str1));
        System.out.println("String str2 " + System.identityHashCode(str2));
        System.out.println("String str3 " + System.identityHashCode(str3));
    }

}
