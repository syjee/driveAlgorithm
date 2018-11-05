package main; 

public class Hello implements Command{
    public static void main(String[] args) {
        System.out.println("There are 4 command in this project");

        System.out.println(Forward);
        System.out.println(Backward);
        System.out.println(Right);
        System.out.println(Left);

    }
}