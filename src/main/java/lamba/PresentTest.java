package lamba;

import jvm.Student;

import java.util.*;

public class PresentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student stu = new Student();
        stu.setNum("aaa1");
        stu.setName("heming");
        students.add(stu);
        stu = new Student();
        stu.setNum("bbb");
        stu.setName("xxxx");
        students.add(stu);
        stu = new Student();
        stu.setNum("aaa2");
        stu.setName("hem");
        students.add(stu);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getNum().compareTo(o2.getNum());
            }
        });
//        students.stream().sorted((arg1,arg2)->{
//            return arg1.getNum().compareTo(arg2.getNum());
//        }).map(x->x).collect(x->x);
        System.out.println(students);
//        Optional<Student> studentOptional = students.stream().filter(x-> x.getNum().equals("aaa")).findFirst();
//
//        studentOptional.ifPresent(v->{
//            System.out.println(v.getName());
//        });
//        if(!studentOptional.isPresent()){
//            System.out.println("xxxxxx");
//        }
    }
}
