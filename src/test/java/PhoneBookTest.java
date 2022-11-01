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

    @Test
    public void findByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String name ="Сергей";
        String phoneNumber = "+7(999)-999-99-99";
        phoneBook.add(name,phoneNumber);
        assertEquals(name,phoneBook.findByNumber(phoneNumber).getName());
    }

    @Test
    public void addGroup() {
        PhoneBook phoneBook = new PhoneBook();
        String groupName = "Работа";
        assertNotNull(phoneBook.addGroup(groupName));
    }

    @Test
    public void addContactToGroup(){
        PhoneBook phoneBook = new PhoneBook();
        String groupName = "Работа";
        Contact Sergey = new Contact("Сергей", "+7(999)-999-99-99");

        assertEquals(phoneBook.addGroup(groupName).add(Sergey),phoneBook.addContactToGroup(groupName,Sergey));
    }

}