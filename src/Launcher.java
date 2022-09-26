import java.util.ArrayList;
import java.util.List;

public class Launcher {      
    public static void main(String[] args){
        List<Command> commands = new ArrayList<Command>();
        commands.add(new Fibo());
        commands.add(new Freq());
        commands.add(new Quit());
        System.out.println("Bienvenue!");
        try(var scanner = new java.util.Scanner(System.in)){
            while(true){
                System.out.println("enter command :");
                boolean result = false,test = true;
                String line = scanner.nextLine();
                for(int i=0; i<commands.size(); i++) {
                    Command command = commands.get(i);
                    if(command.name().equals(line)) {
                        result = command.run(scanner);
                        test = false;
                        break;
                    }
                }
                if(result == true) break;
                if(test == true) System.out.println("Unknown command " + line);
            }
        }
    }
}
