package Test;

public class CarFactory {


    public Car getCar(String Car){
        if(Car.equalsIgnoreCase("Benz")) {
            return new Benz();
        } else if(Car.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if(Car.equalsIgnoreCase("saipa")) {
            return new Saipa();
        }
        return null;
    }
}
