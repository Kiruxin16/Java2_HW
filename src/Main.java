//import lesson1.*;
//import lesson2.*;
import lesson3.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] words = new String[]{
                "Лук","Сосна","Весна","Лопасти","Ветер","Сосна",
                "Лисица","Лук","Лук","Лисица","Оснень","Лисица",
                "Лисица","Ветер"};


        Map<String, Integer> counter = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String val = words[i];
            Integer integer = counter.getOrDefault(val,0);
            counter.put(val,integer+1);
        }
        System.out.println(counter);


        PhoneBook.add("Вольнов","8(923)8842525");
        PhoneBook.add("Сергеев","8(952)8234725");
        PhoneBook.add("Потапова","8(913)3547725");
        PhoneBook.add("Петров","8(926)6433525");
        PhoneBook.add("Вольнов","8(923)1232425");
        PhoneBook.add("Вилин","8(978)8342125");

        PhoneBook.add("Алексеев","8(923)8842525");

        PhoneBook.get("Вольнов");
        PhoneBook.get("Петров");
        PhoneBook.get("Потапова");
        PhoneBook.get("Баков");



    }




}
