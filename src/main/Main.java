package main;

import java.io.IOException;
import java.io.FileInputStream;

public class Main implements Command {

    public static char[] readFile(){
        String file_location = "src/main/move.txt";

        FileInputStream fis = null;
        char[] arr = new char[64];
        int index = 0;
        try{
            fis = new FileInputStream(file_location);
            int nRead = 0;
            while (true) 
            { 
                nRead = fis.read();
                if(nRead <= 0){
                    break;
                } else if(nRead == 9  || nRead == 10 || nRead == 13 || nRead == 32){
                    continue;   //except tab,space,enter ...
                } else {
                    arr[index++]=(char)nRead;
                }
            }
            System.out.print("Commands : ");
            System.out.println(arr);
            System.out.println("index : " +index);
            
            fis.close();  
        }catch(IOException e){
            System.out.println(e);
            System.out.println("File open error! plz check the location of your file");
        }

        return arr;
    }

    public static char[] convertToAbsolute(char[] arr){

        return arr;
    }
    public static void main(String[] args) {

        char[] relative_commands = readFile();
        char[] absolute_commands = convertToAbsolute(relative_commands);

        location car_Location = new location();
        System.out.println(car_Location.showLocation());

        car_Location.drive(absolute_commands);

        System.out.println(car_Location.showLocation());

    }
}