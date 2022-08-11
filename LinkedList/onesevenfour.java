import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class onesevenfour{
    Map<Character, Integer> freqMap = new HashMap<>();
    public String FirstNonRepeating(String a)
    {
    StringBuilder result = new StringBuilder();
    Deque<Character> deque = new LinkedList<>();
    for(char c : a.toCharArray()) {
    
    if(!freqMap.containsKey(c)) {
    deque.offerLast(c);
    result.append(deque.peekFirst());
    }
    else {
    deque.remove(c);
    if(deque.isEmpty())
    result.append("#");
    else result.append(deque.peekFirst());
    }
    freqMap.compute(c, (k, v) -> v == null? 1 : v + 1);
    }
    return result.toString();
    }
}