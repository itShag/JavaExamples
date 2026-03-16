import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class User {
    String Name;
    int age;
    public User(String name, int age) {
        this.Name = name;
        this.age = age;
    }
}

public class Program {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(45);
        numbers.add(67);
        // dynbot.ru/java2
        System.out.println("Размер: " + numbers.size()); // Узнать размер
        
        System.out.println("3-ий элемент: " + numbers.get(2)); // Прочиать элемент

        numbers.remove(1);  // Удаление элемента

        numbers.add(324);
        numbers.add(7);
        numbers.add(55);

        System.out.println("Коллекция: " + numbers);

        for (int num : numbers) {
            System.out.print(num + ", ");
        }

        numbers.set(0, 555);
        System.out.println("Коллекция: " + numbers);

        if (numbers.contains(67)) {
            System.out.println("Число 67 есть в коллекции");
        }

        // Коллекция - Очередь
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(45);
        queue.add(23);
        queue.add(7);
        queue.add(9);
        System.out.println("Очередь: " + queue);
        System.out.println("Элемент: " + queue.remove());
        System.out.println("Очередь: " + queue);
        
        // Коллекция - словарь (хеш-таблица)
        Dictionary<String, Integer> dict = new Hashtable<>();
        dict.put("Olga", 18);
        dict.put("Ivan", 23);
        dict.put("Pavel", 5);
        dict.put("Anna", 33);

        System.out.println(dict.get("Pavel"));


        List<User> users = new ArrayList<>(5);
        User user1 = new User("Anna", 18);
        
        users.add(user1);
        users.add(new User("Alex", 15));

        System.out.println(users.get(0).Name);
        System.out.println(users.get(1).Name);
        System.out.println("Коллекция users: " + users);

        Scanner in = new Scanner(System.in);
        while (true) {            
            String name = "";
            int age = 0;
            System.out.print("Имя: ");
            name = in.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Возраст: ");
            age = in.nextInt();
            in.nextLine();
            users.add(new User(name, age));
        }

        for (var user: users) {
            System.out.print("Имя: " + user.Name);
            System.out.print(" Возраст: " + user.age);
            System.out.println();
        }



    }
}
