package DZ4.task2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook =new PhoneBook();
        phoneBook.add("Yakimov","911");
        phoneBook.add("Kharanov", "918");
        phoneBook.add("sdfcsd", "6543");
        phoneBook.add("sdgvsdg", "564");
        phoneBook.add("sdgvsdg", "6756");
        phoneBook.get("sdgvsdg");
    }
}
