public class Car {
    private String make;
    private String model;
    private double price;

    Car(String make, String model, double price){
            this.make = make;
            this.model = model;
            this.price = price;
    }

    public double getPrice(){
        return price;
    }
    void printDetails(){
        System.out.println("Make of the car: "+ make);
        System.out.println("Model of the car: "+ model);
        System.out.println("Price of the car: "+ price);
    }
}
