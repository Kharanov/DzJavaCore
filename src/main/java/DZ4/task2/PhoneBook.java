package DZ4.task2;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();

    }

    public void add(String lastname, String phoneNumber) {
        ArrayList<String> phoneNumbers = phoneBook.get(lastname);
        if (phoneNumbers == null) {
            phoneNumbers = new ArrayList<String>();
            phoneBook.put(lastname, phoneNumbers);
        }
        phoneNumbers.add(phoneNumber);
    }

    public void get(String lastname) {

        ArrayList<String> phoneNumbers = phoneBook.get(lastname);
        if (phoneNumbers != null) {

            for (int i = 0; i < phoneNumbers.size(); i++) {
                System.out.println(phoneNumbers.get(i));
            }
        }
    }
}
