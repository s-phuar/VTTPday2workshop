package cars;

public class Car {
    //Members of the class
    protected String make;
    protected String owner;
    protected int fuel = 100;


    //Constructor, no return type do not put void
    public Car(){
    }

    //Getters and Setters, encapsulation of members (instance fields)
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    //Methods - behaviours
    public void info(){
        System.out.printf("Make: %s, Owner: %s\n", this.make, this.owner);
    }

    //method overloading, and inter method overloading
    //same name but different parameters
    public void go(){
        //this.fuel --;
        this.go(1, false);
    }

    public void go(int distance){
        //this.fuel -= distance;
        this.go(distance, false);
    }

    public void go(int distance, boolean turbo){
        if(turbo){
            this.fuel -= 2;
        }
        this.fuel -= distance;
    }




}
