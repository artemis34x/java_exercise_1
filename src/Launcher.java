public class Launcher {
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }
    public static void main(String[] args){
        System.out.println("Bienvenue!");

        try (var scanner = new java.util.Scanner(System.in)) {
            while (true){
                String input = scanner.nextLine();
                if("fibo".equals(input)){
                    int result = fib(Integer.parseInt(scanner.nextLine()));
                    System.out.println(result);
                }else if(!"quit".equals(input)){
                    System.out.println("unknown command");
                }else if("quit".equals(input)){
                    System.out.println("exiting...");
                    break;
                }
            }   
        }

    }
}
