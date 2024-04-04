package lamba;

import jvm.Student;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
//        String planProjectCode = null;
//        String actProjectCode = null;
//        System.out.println(Stream.of(planProjectCode, actProjectCode).allMatch(Objects::isNull));
        List<Student> list = new ArrayList<>();
        Student stu = new Student();
        stu.setNum("1111");
        stu.setName("hem");
        list.add(stu);
        stu = new Student();
        stu.setNum("2222");
        stu.setName("heming");
        list.add(stu);
        Map<String,Student> mapStu = new HashMap<>();
        list.stream().forEach(v->{
            mapStu.put(v.getNum(), v);
        });
        System.out.println(mapStu);
    }
}
