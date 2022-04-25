package HashMap;

import java.util.*;
@SuppressWarnings({"unchecked", "rawtypes"})


public class p439_ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        // hashMap 자료를 저장하는 메소드(키, 값) : Create
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234"); // OK, 이미 존재하는 키 추가 가능. 기존 값(위의 asdf/1111) 은 사라짐

        Scanner s = new Scanner(System.in); // 화면으로부터 라인 단위로 입력받음

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.println("id : ");

            // trim() : 입력값의 앞 뒤 공백 제거
            String id = s.nextLine().trim();

            System.out.println("password : ");
            // 공백 제거 이유 -> 같은 것을 비교할 때 공백이 있으면 안되므로
            String password = s.nextLine().trim();
            System.out.println();

            // HashMap 자료 구조의 키값이 있는지 확인하는 메소드
            // 있으면 true 없으면 false
            if(!map.containsKey(id)) {
                // if(map.containKey(id) == false)와 동일
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해 주세요.");
                continue; // 아래의 로직 실행 안시키고 반복문 재 실행
            }

            // id 있으면 패스워드 같은지 체크
            // get : 매개변수 key를 넣으면 HashMap의 값(password)
            if(!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break; // 무한루프 종료
            }
        }
    }
}
