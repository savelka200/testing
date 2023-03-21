public class Book {
    String name;
    String publishingHouse;
    int price;
    int year;
    int numberofPages;
    Author author;

    public Book(String name,String publishingHouse,int price, int year,int numberofPages, Author author){
        this.name=name;
        this.publishingHouse=publishingHouse;
        this.price=price;
        this.year=year;
        this.numberofPages=numberofPages;
        this.author=author;
    }
    public String toString(){
        return "название книги: "+name+", издание: "+publishingHouse+", цена: "+price+", год: "+year+", кол-во старниц: "+numberofPages+", автор: "+author;
    }
}
