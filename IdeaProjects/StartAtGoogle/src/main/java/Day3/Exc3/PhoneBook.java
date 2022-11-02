package Day3.Exc3;

import java.util.ArrayList;

public class PhoneBook {
    String phoneName;
    ArrayList<Contact> phoneBook = new ArrayList<>();

    public void namePhoneBook(String phoneName) {
        this.phoneName = phoneName;
    }

    public void addContactToPhoneBook(Contact contact) {
        phoneBook.add(contact);
    }
}
