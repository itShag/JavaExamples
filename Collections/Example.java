import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Example {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Example string");
        String other = "Other string";
        words.add(other);

        System.out.println(words.get(1));

        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {            
            System.out.println(words.get(i));
        }
        // foreach - for each (для каждого)
        for (var str: words) {
            System.out.println(str);
        }

        Map<String, String> months = new HashMap<>();
        months.put("Jan", "Январь");
        months.put("Feb", "Февраль");

        for (var key : months.keySet()) {
            System.out.println(key);
            String value = months.get(key);
            System.out.println(value);
        }

        // age - возраст, ages - возраста
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Anna", 24);        
        ages.put("Irina", 18);
        ages.put("Pavel", 27);

        int agePavel = ages.get("Pavel");
        
        String name = "";        
        for (String n : ages.keySet()) {
            if (ages.get(n) == 18) {
                name = n;
                break;
            }
        }
        System.out.println("Name is 18 age: " + name);

        var result = ages.entrySet();
        for (var entry : result) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        System.out.println(result);   
        
        /*
        List 
        Map
        Queue
        Stack        
        */
        Queue<Integer> qu = new ConcurrentLinkedQueue<>();
        qu.add(34);
        qu.add(56);
        qu.add(72);
        qu.add(128);
        qu.add(256);
        int number = qu.peek();
        System.out.println(number);
        System.out.println(qu);

        Stack<Integer> stack = new Stack<>();
        stack.add(23);
        stack.add(45);
        stack.add(67);
        stack.add(89);
        stack.add(90);
        int n = stack.pop();
        System.out.println(n);
        System.out.println(stack);

        String username = "Ivan";
        username = username + " Ivanov";
        System.out.println(username);

        StringBuilder builder = new StringBuilder();
        builder.append("gdfdfg");
        builder.append("gdfdfg");
        builder.append("gdfdfg");
        builder.append("gdfdfg");
        builder.append("gdfdfg");
        builder.append("gdfdfg");
        builder.toString();

        Map<String, Map<String, String>> many = new HashMap<>();
        var item = many.get("Alex");
        var key = item.get("ID");


    }
}
