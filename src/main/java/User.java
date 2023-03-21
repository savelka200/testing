public class User {
    static int totalonLine=0;
    String name;
    String surname;
    String email;

    public User(){totalonLine++;}

    public User(String name, String surname,String email){
        this.name=name;
        this.surname=surname;
        this.email=email;
        totalonLine++;
    }
    public String toString(){return name + surname + email;}
}
