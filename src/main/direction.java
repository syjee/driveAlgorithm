package main;

public class direction implements Command{
    final char North = 'N';

    public char dir1;
    public char dir2;
    public char dir3;
    public char dir4;

    public direction(){    
    //   absolute dir number
    //         4
    //      2     1
    //         3

    //         N
    //      W     E
    //         S

        this.dir1 = 'E';
        this.dir2 = 'W';
        this.dir3 = 'S';
        this.dir4 = 'N';
    }


    public void ShiftNorth(int num){
        switch(num){
    //move dir1 to North         
    //         W
    //      S     N
    //         E
            case 1:
            this.dir3 = 'E';
            this.dir4 = 'W';
            this.dir2 = 'S';
            this.dir1 = 'N';
            break;

    //move dir2 to North    
    //         E
    //      N     S
    //         W
            case 2:
            this.dir4 = 'E';
            this.dir3 = 'W';
            this.dir1 = 'S';
            this.dir2 = 'N';
            break;

    //move dir3 to North    
    //         S
    //      E     W
    //         N
            case 3:
            this.dir2 = 'E';
            this.dir1 = 'W';
            this.dir4 = 'S';
            this.dir3 = 'N';
            break;

    //move dir4 to North    
    //         N
    //      W     E
    //         S
            case 4:
            this.dir1 = 'E';
            this.dir2 = 'W';
            this.dir3 = 'S';
            this.dir4 = 'N';
            break;

            default: break;
        }
    }

    //if relative_command is F
    public char PressF(){
        if(this.dir1 == North){
        //and if dir1 is North
        //absolute_command is R

            ShiftNorth(1);
            return Right;

        }else if(this.dir2 == North){
        //and if dir2 is North
        //absolute_command is L
        
            ShiftNorth(2);
            return Left;

        }else if(this.dir3 == North){
        //and if dir3 is North
        //absolute_command is B

            ShiftNorth(3);
            return Backward;
        }else{

        //and if dir4 is North
        //absolute_command is F

            ShiftNorth(4);
            return Forward;
        }
    }
    
    //if relative_command if B
    public char PressB(){
        if(this.dir1 == North){
            //and if dir1 is North
        //absolute_command is L

            ShiftNorth(2);
            return Left;
        }else if(this.dir2 == North){
            //and if dir2 is North
        //absolute_command is R

            ShiftNorth(1);
            return Right;
        }else if(this.dir3 == North){
            //and if dir3 is North
        //absolute_command is F

            ShiftNorth(4);
            return Forward;
        }else{
            //and if dir4 is North
        //absolute_command is B

            ShiftNorth(3);
            return Backward;
        }
    }

    //if relative_command is R
    public char PressR(){
        if(this.dir1 == North){
            //and if dir1 is North
        //absolute_command is B

            ShiftNorth(3);
            return Backward;
        }else if(this.dir2 == North){
            //and if dir2 is North
        //absolute_command is F

            ShiftNorth(4);
            return Forward;
        }else if(this.dir3 == North){
            //and if dir3 is North
        //absolute_command is L

            ShiftNorth(2);
            return Left;
        }else{
            //and if dir4 is North
        //absolute_command is R

            ShiftNorth(1);
            return Right;
        }
    }

    //if relative_command is L
    public char PressL(){
        if(this.dir1 == North){
            //and if dir1 is North
        //absolute_command is F

            ShiftNorth(4);
            return Forward;
        }else if(this.dir2 == North){
            //and if dir2 is North
        //absolute_command is B

            ShiftNorth(3);
            return Backward;
        }else if(this.dir3 == North){
            //and if dir3 is North
        //absolute_command is R

            ShiftNorth(1);
            return Right;
        }else{
            //and if dir4 is North
        //absolute_command is L

            ShiftNorth(2);
            return Left;
        }
    }


}