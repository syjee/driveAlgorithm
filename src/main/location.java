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

    public int get_locationX() {
        return this.x;
    }

    public int get_locationY() {
        return this.y;
    }

    public void go_up() {
        this.y++;
    }

    public void go_down() {
        this.y--;
    }

    public void go_right() {
        this.x++;
    }

    public void go_left() {
        this.x--;
    }

    public void drive(char[] absolute_commands) {
        for (int i = 0; i < absolute_commands.length; i++) {
            
            switch (absolute_commands[i]) {
            case Forward:
                System.out.println("Forward!");
                this.go_up();
                break;

            case Backward:
                System.out.println("Backward!");
                this.go_down();
                break;

            case Right:
                System.out.println("Right!");
                this.go_right();
                break;

            case Left:
                System.out.println("Left!");
                this.go_left();
                break;

            default:
                return;
            }
        }
    }

    public String showLocation() {
        return new String("(" + get_locationX() + "," + get_locationY() + ")");
    }
}