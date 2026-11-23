public class Shoping {
    public static void main(String[] args) {
      
      /* 
        System.out.println(addition(17,42));
       System.out.println(subtraction(198,27));
       System.out.println(multiplication(23,4));
      System.out.println(division(14,3)); 
      */
        System.out.println(cToF(17.5));
        System.out.println(fToC(100));
    }
    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static double division(int a, int b){
        return a / b;
    }

    public static double cToF(double celsius){
        return (celsius *9/5)+32;
    }

    public static double fToC(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}
