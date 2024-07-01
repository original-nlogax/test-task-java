import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class MyClass {
    public static void main(String args[]) {
        Map<Object, Integer> freq = new HashMap<>();
        List<Object> list = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        
        for (Object o : list) {
            if (freq.containsKey(o)) {
                freq.put(o, freq.get(o)+1);
            } else {
                freq.put(o, 1);
            }
        }
        
        System.out.println(freq);
    }
}