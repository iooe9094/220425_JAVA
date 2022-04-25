package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
@SuppressWarnings({"unchecked", "rawtypes"})

public class p405_ex11_2 {
    public static void main(String[] args) {
        Stack st = new Stack<>();

        // LinkedList 큐를 구현할 수 있음
        // Queue Interface : 구현된 메소드는 없고 이름만 있음
        Queue q = new LinkedList();

        // push : st에 값을 추가
        st.push("0");
        st.push("1");
        st.push("2");

        // offer : q에 값을 추가
        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println(" = Stack = ");
        // while(st.empty != true)와 같은 의미
        // 스택에 값이 있으면 반복문 처리
        while(!st.empty()) {
            // pop : 스택에서 꺼낸 값을 반환(return)
            //     : Read + Delete
            System.out.println(st.pop());
        }

        System.out.println(" = Queue = ");
        while(!q.isEmpty()) {
            // poll : 큐에서 꺼낸 값을 반환, 없으면 null
            System.out.println(q.poll());
        }
    }
}