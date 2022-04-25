package Iterator;

import java.util.ArrayList;
// import java.util.Iterator;
// @SuppressWarnings({"unchecked", "rawtypes"})

public class p412_ex11_5 {
    public static void main(String[] args) {
        // 향상된 for문 2. 지네릭스를 통해 <타입> 해줘야 함
        ArrayList<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        // 향상된 for문 1.
        for(String s : list) {
            System.out.println(s);
        }
        // 이터레이터를 이용한 for문
        // Iterator it = list.iterator();

        // while(it.hasNext()) {
        //     Object obj = it.next();
        //     System.out.println(obj);
        // }
    }
    
}
