package main;

import java.io.IOException;
import java.io.FileInputStream;

public class Main implements Command {

    //array size for commands
    public final static int SIZE = 64;

    //read move.txt file
    public static char[] readFile(){
        String file_location = "src/main/move.txt";

        FileInputStream fis = null;
        char[] arr = new char[SIZE];
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

            //print relative commands
            System.out.print("Relative_commands : ");
            System.out.println(arr);
            
            fis.close();  
        }catch(IOException e){
            System.out.println(e);
            System.out.println("File open error! plz check the location of your file");
        }

        return arr;
    }

    //covert relative commands to absolute commands
    public static char[] convertToAbsolute(char[] arr){
        direction dir = new direction();

        char[] newCommands = new char[SIZE]; 
        for(int i = 0; i< arr.length; i++){
            switch(arr[i]){
                //convert F to absolute command 
                case Forward: 
                newCommands[i] = dir.PressF();
                break;

                //convert B to absolute command
                case Backward: 
                newCommands[i] = dir.PressB();
                break;

                //convert R to absolute command
                case Right: 
                newCommands[i] = dir.PressR();
                break;

                //convert L to absolute command
                case Left: 
                newCommands[i] = dir.PressL();
                break;
                
                default: break;
            }
        }
        return newCommands;
    }
    public static void main(String[] args) {

        //read move.txt file and get relative commands 
        char[] relative_commands = readFile();

        //covert relative commands to absolute commands
        char[] absolute_commands = convertToAbsolute(relative_commands);
        
        //print absolute commands
        System.out.print("Absolute_commands : ");
        System.out.println(absolute_commands);

        //print initial location of the car
        location car_Location = new location();
        System.out.print("Result : "+car_Location.showLocation()+" - > ");

        //move the car following the absolute commands
        car_Location.drive(absolute_commands);

        //after the drive, print present location of the car
        System.out.println(car_Location.showLocation());

    }
}