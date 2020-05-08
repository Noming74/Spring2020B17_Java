package day33_CustomsClass;

public class Car {
    String Brand;
    String model;
    int year;
    int Mileage;
    String color;
    public void start(){
        System.out.println(Brand + " is started");
    }
    public void drive(){
        System.out.println(Brand + " " + model + " is driving");
    }
    public void getCarInfo(){
        System.out.println(year + " " + Brand + " " + model + " " + color);
    }
    public void setCarInfo (String carBrand, String carModel, int carYear, String carColor ){
        Brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
    }
    public String toString(){
        String result = year + " " + Brand + " " + model + " " + color;
        return result;
    }
    public static void main(String[] args) {
        int a = 100; // local variable
    }
}


