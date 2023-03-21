import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testToStringTrue() {
        User user1 = new User("Иван","Масликов","ivan@mail.ru");
        User user2 = new User("user","userov","user@gmail.com");
        assertEquals(2,User.totalonLine);
    }

    @Test
    public void testToStringFalse() {
        User user1 = new User("Иван","Масликов","ivan@mail.ru");
        User user2 = new User("user","userov","user@gmail.com");
        assertEquals(5,User.totalonLine);
    }

}