import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void add() {
        PhoneBook phoneBook = new PhoneBook();
        Set<Contact> contacts = new TreeSet<>();
        Contact contact = new Contact("Сергей", "+7(999)-999-99-99");
        assertEquals(contacts.add(contact),phoneBook.add(contact));
    }

}