import java.util.*;

public class PhoneBook {

    //список всех контактов
    private TreeSet<Contact> contacts = new TreeSet<>();

    //добавление нового контакта
    public boolean add(String name, String mobileNumber) {
        Contact contact = new Contact(name, mobileNumber);
        return contacts.add(contact);
    }

    //поиск контакта по номеру телефона
    public Contact findByNumber(String mobileNumber) {
        //поиск наименьшего элемента больше или равного элемента с телефоном mobileNumber
        //контакты упорядочены по номерам телефонов
        Contact result = contacts.ceiling(new Contact(null, mobileNumber));
        return result.getMobileNumber().equals(mobileNumber)? result : null;
    }
}
