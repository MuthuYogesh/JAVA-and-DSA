import java.util.*;

public class reverse {
    public static void main(String[] args) {
        ArrayDeque <Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        int n = queue.size();
        Stack <Integer> temp = new Stack<>();
        for (int val:queue){
            temp.push(queue.poll());
        }
        while(!temp.isEmpty()){
            queue.add(temp.pop());
        }
        System.out.println(queue);
    }
}
