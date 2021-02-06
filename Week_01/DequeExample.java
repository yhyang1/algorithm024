import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    // 删除排序数组中的重复项（Facebook、字节跳动、微软在半年内面试中考过）
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);

        String str = deque.peekFirst();
        System.out.println(str);

        while (deque.size() > 0) {
            System.out.println(deque.pollFirst());
        }
        System.out.println(deque);
    }

}