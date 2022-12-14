import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Freq implements Command {
    public static void mostUsed(String path) throws Exception{    
        String line, word1 = "",word2 = "",word3 = "";    
        int count = 0, maxCount = 0;    
        ArrayList<String> words = new ArrayList<String>();    
            
        //Opens file in read mode    
        FileReader file = new FileReader(path);    
        BufferedReader br = new BufferedReader(file);    
            
        //Reads each line    
        while((line = br.readLine()) != null) {    
            String string[] = line.toLowerCase().split("[, ?.!:-]+");    
            //Adding all words generated in previous step into words    
            for(String s : string){    
                words.add(s);    
            }   
        }    
            
        //Determine the most repeated word in a file    
        for(int i = 0; i < words.size(); i++){    
            count = 1;    
            //Count each word in the file and store it in variable count    
            for(int j = i+1; j < words.size(); j++){    
                if(words.get(i).equals(words.get(j))){    
                    count++;    
                }     
            }    
            //If maxCount is less than count then store value of count in maxCount     
            //and corresponding word to variable word    
            if(count > maxCount){    
                maxCount = count;    
                word1 = words.get(i);    
            }    
        }    
            
        maxCount = 0;
        //Determine the most repeated word in a file    
        for(int i = 0; i < words.size(); i++){    
            count = 1;    
            //Count each word in the file and store it in variable count    
            for(int j = i+1; j < words.size(); j++){    
                if(words.get(i).equals(words.get(j)) && !words.get(i).equals(word1)){    
                    count++;    
                }     
            }    
            //If maxCount is less than count then store value of count in maxCount     
            //and corresponding word to variable word    
            if(count > maxCount){    
                maxCount = count;    
                word2 = words.get(i);    
            }    
        }
        
        maxCount = 0;
        //Determine the most repeated word in a file    
        for(int i = 0; i < words.size(); i++){    
            count = 1;    
            //Count each word in the file and store it in variable count    
            for(int j = i+1; j < words.size(); j++){    
                if(words.get(i).equals(words.get(j)) && !words.get(i).equals(word1) && !words.get(i).equals(word2)){    
                    count++;    
                }     
            }    
            //If maxCount is less than count then store value of count in maxCount     
            //and corresponding word to variable word    
            if(count > maxCount){    
                maxCount = count;    
                word3 = words.get(i);    
            }    
        }
        System.out.println(word1+" "+word2+" "+word3);
        br.close();    
    } 

    public String name(){ return "freq"; }

    public boolean run(Scanner scanner){
        System.out.println("enter the text file path :");
        String path = scanner.nextLine();
        try {
            mostUsed(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
