package lesson3;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiConsumer;

public class PhoneBook {
    private static Map<String, List<String>> notes=new HashMap<>();

    public static void add(String surname, String phoneNumber ){
        notes.forEach(new BiConsumer<String, List<String>>() {
            @Override
            public void accept(String s, List<String> strings) {
                if(strings.contains(phoneNumber)){
                    System.out.println("Выбранный телефон уже есть в справочнике.");
                    return;
                }
            }
        });
        if(notes.containsKey(surname)){
            List<String> pool = notes.get(surname);
            pool.add(phoneNumber);
        }else {
            notes.put(surname,new ArrayList<>(Arrays.asList(phoneNumber)));
        }
    }

    public static List<String> get(String surname) {
        if (notes.containsKey(surname)) {
            System.out.println("Под фамилией " + surname + " известны номера:");
            for (String phone : notes.get(surname)) {
                System.out.println(phone);
            }
        }else {
            System.out.println("Не нашлось номеров с фамилией "+surname);
        }
        return notes.get(surname);
    }
}
