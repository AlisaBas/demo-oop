package by.itacademy.habasaraba.javabasics.oop;

public class demoOP {
    public static void main(String[] args) {
        Customer customerOne=new Customer(1,"Ivanov","Ivan","Ivanovich","24 Ave",06070,68686 );

        System.out.println(customerOne);
        customerOne.setName("Anton");
        System.out.println(customerOne);

        Book bookOne=new Book(2,"Harry Potter","Joanne Rowling", "Eksmo", 2019,345,25.89);
        System.out.println(bookOne);

        Car carOne=new Car(123,"Toyota","Corolla",2019,"Black",23000,"AM12345");
        System.out.println(carOne);

    }
}
