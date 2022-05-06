package PracticingMethods;

public class MethodReturnTypes {

    public static void main(String[] args) {
        System.out.println(name("String of text") + "\n"+ age(5) + "\n" + isThatRight(false));
    }
    public static String name(String name1){
        return name1;
    }
    public static int age (int age1){
        return age1;
    }
    public static boolean isThatRight (boolean thatRight){
        return thatRight;
    }
}
