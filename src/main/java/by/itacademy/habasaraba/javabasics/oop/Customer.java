package by.itacademy.habasaraba.javabasics.oop;

public class Customer {
   private int id;
    private String lastName;
   private String name;
    private String fathersName;
    private char address;
    private int cardNumber;
    private int account;

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setLastName(String newLastName){
        lastName=newLastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setFathersName(String newFathersName){
        fathersName=newFathersName;
    }

    public String getFathersName(){
        return fathersName;
    }

    public void setAddress(char newAddress){
        address=newAddress;
    }

    public char getAddress(){
        return address;
    }

    public void setCardNumber(int newCardNumber){
        cardNumber=newCardNumber;
    }

    public int getCardNumber(){
        return cardNumber;
    }

    public void setAccount(int newAccount){
        account=newAccount;
    }

    public int getAccount(){
        return account;
    }
}
