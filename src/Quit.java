import java.util.Scanner;

public class Quit implements Command{
    public String name() { return "Quit"; }

    public boolean run(Scanner command){
        System.out.println("exiting program...");
        return true;
    }
}
