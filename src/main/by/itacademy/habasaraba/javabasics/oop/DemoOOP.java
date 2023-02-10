package by.itacademy.habasaraba.javabasics.oop;

public class DemoOOP {
    public static void main(String[] args) {
        Book bookOne=new Book();
        bookOne.setId(10857656);
        bookOne.setName("Ten little indians");
        bookOne.setAuthor("Agatha Christie");
        bookOne.setPublisher("Eksmo");
        bookOne.setPages(288);
        bookOne.setYear(2021);
        bookOne.setPrice(11.84);

        Book bookTwo=new Book();
        bookTwo.setId(10642203);
        bookTwo.setName("Picture of Dorian Gray");
        bookTwo.setAuthor("Oscar Wilde");
        bookTwo.setPublisher("AST");
        bookTwo.setYear(2019);
        bookTwo.setPages(320);
        bookTwo.setPrice(8.04);

        System.out.println(bookOne.getId());
        System.out.println(bookOne.getName());
        System.out.println(bookOne.getAuthor());
        System.out.println(bookOne.getPublisher());
        System.out.println(bookOne.getYear());
        System.out.println(bookOne.getPages());
        System.out.println(bookOne.getPrice());

        System.out.println(bookTwo.getId());
        System.out.println(bookTwo.getName());
        System.out.println(bookTwo.getAuthor());
        System.out.println(bookTwo.getPublisher());
        System.out.println(bookTwo.getYear());
        System.out.println(bookTwo.getPages());
        System.out.println(bookTwo.getPrice());

        Car carOne=new Car();
        carOne.setId(103720835);
        carOne.setBrand("Ford");
        carOne.setModel("Fiesta");
        carOne.setYear(2018);
        carOne.setColor("Cherry");
        carOne.setPrice(9000);
        carOne.setNumber("AM12345");

        System.out.println(carOne.getId());
        System.out.println(carOne.getBrand());
        System.out.println(carOne.getModel());
        System.out.println(carOne.getYear());
        System.out.println(carOne.getColor());
        System.out.println(carOne.getPrice());
        System.out.println(carOne.getNumber());

        Customer customerOne=new Customer();
        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton
        String streetAddress = faker.address().streetAddress();// 60018 Sawayn Brooks Suite 449

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(streetAddress);


    }
}
