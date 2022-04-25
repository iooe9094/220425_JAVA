package Stack_Queue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
@SuppressWarnings({"unchecked", "rawtypes"})

public class p409_ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while(true) {
            System.out.println(">>");
            try {
                // 화면으로부터 라인 단위로 입력받음
                Scanner s = new Scanner(System.in);
                // 한 라인씩 입력 받고 trim(앞 뒤 공백 지움) 사용
                String input = s.nextLine().trim();

                // 입력여부 유효성 체크 : 아무 값도 없으면 위로 올림
                if("".equals(input)) continue;

                // equalsIgnoreCase : 대소문자 구별하지 않고 동일한지 확인
                if(input.equalsIgnoreCase("q")) {
                    // exit : 자바 프로그램 강제 종료 명령어
                    // 무한 루프 탈출
                    System.exit(0);
                    // 입력값이 help면 도움말 보여주기
                } else if(input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 실행합니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if(input.equalsIgnoreCase("history")) {
                    int i = 0;
                    // 입력받은 명령어를 저장하고,
                    save(input);

                    // LinkedList의 내용을 보여준다.
                    // 기존에 저장된 모든 명령어를 화면에 입력
                    LinkedList tmp = (LinkedList)q;
                    // 향상된 for문 같이 반복문을 돌리기 위해
                    ListIterator it = tmp.listIterator();

                    while(it.hasNext()) // it안에 자료가 없을 때까지 반복
                    // 자료를 읽고 다음으로 넘어감
                        System.out.println(++i + "." + it.next());
                    } else {
                        // 명령문이므로 자료를 모두 큐에 저장
                        save(input);
                        System.out.println(input);
                    } // if(input.equalsIgnoreCase("q")) {
                } catch (Exception e) { // 예외처리 클래스 조상
                    System.out.println("입력오류입니다.");
                }
            }
        }

        public static void save(String input) {
            // queue에 저장
            // 빈 문자를 제외한 문자열이 들러오면 큐에 저장
            if(!"".equals(input)) {
                q.offer(input);
            }
            
            // queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다.
            if(q.size() > MAX_SIZE) {
                q.remove();
            }
        }
    }
