package cars;


public class Main {

    public static void main(String[] args){
        //creating an instance of the car class
        //Instantiation
        Car myCar = new Car();
        myCar.setMake("Toyota");
        myCar.setOwner("Fred");
        myCar.info();

        Car yourCar = new Car();
        yourCar.setMake("Nissan");
        yourCar.setOwner("Barney");
        yourCar.info();

        Car ourCar = new Car();
        ourCar.setMake("BMW");
        ourCar.setOwner("Wilma");
        ourCar.info();

        //create array of cars, array of objects*
        Car[] trailer = new Car[6];
        trailer[0] = myCar;
        



    }
    
}
