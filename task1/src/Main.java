import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();

        contacts.add("89003337788", "Вася");
        contacts.add("89003485256", "Мася");
        contacts.add("89005317536", "Петя");
        contacts.add("89005317536", "Петя");
        contacts.add("89005317537", "Петя");

        contacts.printAll();
        System.out.println(contacts.findByName("Петя"));
        System.out.println(contacts.findByPartOfName("ас"));
    }
}
