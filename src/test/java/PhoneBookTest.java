import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void add() {
        PhoneBook phoneBook = new PhoneBook();
        Set<Contact> contacts = new TreeSet<>();
        String name ="Сергей";
        String phoneNumber = "+7(999)-999-99-99";
        assertEquals(contacts.add(new Contact(name, phoneNumber)),phoneBook.add(name,phoneNumber));
    }

}