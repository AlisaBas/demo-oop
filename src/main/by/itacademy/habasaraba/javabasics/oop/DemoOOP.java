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
    }
}
