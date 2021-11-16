import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contacts {
    Map<String, String> contacts = new HashMap<>();

    public List<String> findByName(String name){
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry: contacts.entrySet()) {
            if (entry.getValue().equals(name)){
                list.add(entry.getKey());
            }
        }
        if (list.isEmpty()){
            return null;
        } else {
            return list;
        }
    }

    public Map<String, String> findByPartOfName(String partOfName){
        Map<String, String> list  = new HashMap<>();
        for (Map.Entry<String, String> entry: contacts.entrySet()) {
            if (entry.getValue().contains(partOfName)){
                list.put(entry.getKey(), entry.getValue());
            }
        }
        return list;
    }

    public void add(String number, String name) {
        contacts.put(number, name);
    }

    public void printAll(){
        for (Map.Entry<String, String> entry: contacts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}