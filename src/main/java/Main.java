public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ленин", 1889,89 );
        Book book = new Book("Жесть", "Издание",1500,2005,156,author );
        User user1 = new User("Савелий","Морозов","sav@mail.ru");
        User user2 = new User("user","user","user@mail.com");
        System.out.println("кол-во пользователей в сети"+User.totalonLine);
        System.out.println(author);
        System.out.println(book);
        System.out.println(user1);
        System.out.println(user2);
    }

}
