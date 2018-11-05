package main;

//present location of the car
public class location implements Command {
    public int x;
    public int y;

    // initialize the location
    public location() {
        this.x = 0;
        this.y = 0;
    }

    //return the present location of x
    public int get_locationX() {
        return this.x;
    }

    //return the present location of y
    public int get_locationY() {
        return this.y;
    }

    //absolute command is F, move the car upside
    public void go_up() {
        this.y++;
    }
    
    //absolute command is B, move the car downside
    public void go_down() {
        this.y--;
    }

    //absolute command is R, move the car rightside
    public void go_right() {
        this.x++;
    }

    //absolute command is L, move the car leftside
    public void go_left() {
        this.x--;
    }

    //move the car following the absolute commands
    public void drive(char[] absolute_commands) {
        for (int i = 0; i < absolute_commands.length; i++) {
            switch (absolute_commands[i]) {
            case Forward:
                this.go_up();
                break;

            case Backward:
                this.go_down();
                break;

            case Right:
                this.go_right();
                break;

            case Left:
                this.go_left();
                break;

            default:
                return;
            }
        }
    }

    //print the present location
    public String showLocation() {
        return new String("(" + get_locationX() + "," + get_locationY() + ")");
    }
}