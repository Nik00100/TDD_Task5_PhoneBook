import java.util.*;

public class PhoneBook {

    //список всех контактов
    private TreeSet<Contact> contacts = new TreeSet<>();

    //добавление нового контакта
    public boolean add(String name, String mobileNumber) {
        Contact contact = new Contact(name, mobileNumber);
        return contacts.add(contact);
    }
}
