package by.itacademy.habasaraba.javabasics.oop;

public class Customer {
   private int id;
    private String lastName;
   private String name;
    private String fathersName;
    private String address;
    private int cardNumber;
    private int account;

    public Customer(int newId, String newLastName,String newName, String newFathersName, String newAddress, int newCardNumber, int newAccount){
        id=newId;
        lastName=newLastName;
        name=newName;
        fathersName=newFathersName;
        address=newAddress;
        cardNumber=newCardNumber;
        account=newAccount;

    }

    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", account=" + account +
                '}';
    }


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

    public void setAddress(String newAddress){
        address=newAddress;
    }

    public String getAddress(){
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
