package HashSet;

import java.util.*;
@SuppressWarnings({"unchecked", "rawtypes"})

public class p427_ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");

        // 아래의 Person 객체는 중복 제거가 안되고 모두 출력되고 있음
        // 중복 제거가 되도록 수정이 필요함
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }

    // 객체 중복을 제거하려면 equals 와 hashoCode 오버라이딩 필요
    @Override
    public boolean equals(Object obj) {
        // Person이 아니면 메소드 탈출 (종료)
        if(!(obj instanceof Person)) return false;

        // Person 형변환 가능
        Person p = (Person)obj;
        return name.equals(p.name) && age == p.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
