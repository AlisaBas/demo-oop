package by.itacademy.habasaraba.javabasics.oop;

import java.util.Objects;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;
    private String number;

    public Car(int newId,String newBrand, String newModel, int newYear,String newColor, int newPrice, String newNumber){
        id=newId;
        brand=newBrand;
        model=newModel;
        year=newYear;
        color=newColor;
        price=newPrice;
        number=newNumber;
    }



    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return id == car.id && year == car.year && price == car.price && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, year, color, price, number);
    }

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

    public void setNumber(String newNumber){
        number=newNumber;
    }

    public String getNumber(){
        return number;
    }
}

