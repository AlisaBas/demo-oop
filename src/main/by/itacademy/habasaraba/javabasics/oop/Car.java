package by.itacademy.habasaraba.javabasics.oop;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;
    private int number;

    public void setId(int newId){
        id=newId;
    }

    public int getId(){
        return id;
    }

    public void setBrand(String newBrand){
        brand=newBrand;
    }

    public String getBrand(){
        return brand;
    }

    public void setModel(String newModel){
        model=newModel;
    }

    public String getModel(){
        return model;
    }

    public void setYear(int newYear){
        year=newYear;
    }

    public int getYear(){
        return year;
    }

    public void setColor(String newColor){
        color=newColor;
    }

    public String getColor(){
        return color;
    }

    public void setPrice(int newPrice){
        price=newPrice;
    }

    public int getPrice(){
        return price;
    }

    public void setNumber(int newNumber){
        number=newNumber;
    }

    public int getNumber(){
        return number;
    }
}

