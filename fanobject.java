public class Fanobject {

 public static void main(String[] args) {

     // create fan objects
        Fanobject fan1 = new Fanobject();
        fan1.speed = fan1.FAST;
        fan1.radius = 10;
        fan1.color = "yellow";
        fan1.on = true;
        System.out.println(fan1.toString());

        Fanobject fan2 = new Fanobject();
        fan2.speed = fan1.MEDIUM;
        fan2.radius = 5;
        fan2.color = "blue";
        // boolean default value false the fan is off.
        fan2.on = false;
        System.out.println(fan2.toString());
    }

    // declaration of variables
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void setOn(boolean newOn) {
        on = newOn;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }



    public Fanobject() {

    }

    public String toString() {
        if (on) {
            return radius + " " + color + " " + speed + " on";
        } else {
            return radius + " " + color + " off";
        }
    }


}