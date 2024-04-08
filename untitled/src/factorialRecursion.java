public class factorialRecursion {
    public static void main(String[] args) {
        int num = 9;
        float fact = factorial(num);
        System.out.println("Factorial of " + num + " = " + fact);
    }
    public static float factorial(int num){
        if (num >= 1) {
            return num * factorial(num - 1);
        }
        else
        {
            return 1;
        }
    }
}
