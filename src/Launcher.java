public class Launcher {
    public static void main(String[] args){
        System.out.println("Bienvenue!");

        try (var scanner = new java.util.Scanner(System.in)) {
            String input = scanner.nextLine();
            if(!"quit".equals(input)){
                System.out.println("unknown command");
            }
        }

    }
}
