import java.util.Scanner;

public class Fibo implements Command{
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }
    public String name(){ return "Fibo"; }
    public boolean run(Scanner scanner){
        System.out.println("enter a number: ");
        int input = Integer.parseInt(scanner.nextLine());
        int result = fib(input);
        if(result < 0){
            System.out.println("error negative number : "+result);
            System.out.println("exiting...");
            return true;
        }
        System.out.println("Fibo("+input+") = "+result);
        return false;

    }
}
