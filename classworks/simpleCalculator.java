
public class simpleCalculator {

    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static double add(double a, double b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }

    public static double division (double a, double b){
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("============= ADD ====================");
        System.out.println("Add (10+12) : "+add(10, 12));
        System.out.println("Add (10+12+15) : "+add(10, 12,15));
        System.out.println("Add (10.12+12.10) : "+add(10.12, 12.10));

        System.out.println("============= SUB ====================");
        System.out.println("Add (20-12) : "+subtract(20, 12));

        System.out.println("============= MUL ====================");
        System.out.println("Add (2*12) : "+multiply(2, 12));
        System.out.println("Add (2.5*12.17) : "+multiply(2.5, 12.17));

        System.out.println("============= DIV ====================");
        System.out.println("Add (22/2) : "+division(22, 2));
    }    
}
