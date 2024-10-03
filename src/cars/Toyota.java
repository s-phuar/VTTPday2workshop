package cars;

//Inheirtance
public class Toyota extends Car {
    
    private boolean gps = false;
    
    //getters and setters for gps
    public boolean isGps() {return gps;}
    public void setGps(boolean gps) {this.gps = gps;}
    
    //constructor
    public Toyota(){
        setMake("Toyota");
    }

    //Overriding
    //method signature(name e.g. go, parameters e.g. int boolean) is the same as the parents
    //same name and same parameters
    @Override //annotation
    public void go(int d, boolean t){
        this.fuel -= d;
    }


}
