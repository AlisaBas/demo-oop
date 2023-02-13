package by.itacademy.habasaraba.javabasics.oop;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;

    private int year;

    private int pages;
    private double price;

    public Book(int newId, String newName,String newAuthor,String newPublisher,int newYear,int newPages,double newPrice){
        id=newId;
        name=newName;
        author=newAuthor;
        publisher=newPublisher;
        year=newYear;
        pages=newPages;
        price=newPrice;
    }

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    public void setId(int newId){
        id=newId;
    }

    public int getId() {
        return id;
    }

    public void setName(String newName){
        name=newName;
    }

    public String getName(){
        return name;
    }

    public void setAuthor(String newAuthor){
        author=newAuthor;
    }

    public String getAuthor(){
        return author;
    }

    public void setPublisher(String newPublisher){
        publisher=newPublisher;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setYear(int newYear){
        year=newYear;
    }

    public int getYear(){
        return year;
    }

    public void setPages(int newPages){
        pages=newPages;
    }

    public int getPages(){
        return pages;
    }

    public void setPrice(double newPrice){
        price=newPrice;
    }

    public double getPrice(){
        return price;
    }

}
