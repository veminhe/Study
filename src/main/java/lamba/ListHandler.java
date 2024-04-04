package lamba;

import jvm.Student;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListHandler {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student stu = new Student();
        stu.setNum("aaa");
        stu.setName("heming");
        students.add(stu);
        stu = new Student();
        stu.setNum("bbb");
        stu.setName("xxxx");
        students.add(stu);
        stu = new Student();
        stu.setNum("aaa");
        stu.setName("hem");
        students.add(stu);
        students.stream().filter(x-> x.getNum().equals("aaa")).findFirst().ifPresent(v->{
            System.out.println(v.getName());
        });
        System.out.println("--------------");
        students.stream().forEach(v->{
            System.out.println(v.getName());
        });
        System.out.println("--------------");
        Stream<String> nums = students.stream().map(v->{
            return v.getNum();
        });
        nums.forEach(v->{
            System.out.println(v);
        });
        System.out.println("--------------xxxxxxxxxxxxxxx");
        List<Student> list = students.stream().collect(Collectors.toList());
        list.stream().forEach(v->{
            System.out.println(v.getName());
        });
        System.out.println("###########");
        Set<Integer> intList = Stream.of(1,2,3,4,5).collect(Collectors.toSet());
        intList.stream().forEach(x->{
            System.out.println(x);
        });
        System.out.println("--------------xxxxxxxxxxxxxxx");
        Map<Integer,String> map = Stream.of("a","b","c","d")
                .collect(Collectors.toMap(String::hashCode, Function.identity()));
        System.out.println(map);
        int sum1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(0, (n1, n2) -> n1 + n2);
        System.out.println("累加和为：" + sum1);   //累加和为：45
        System.out.println("--------------xxxxxxxxxxxxxxx");
        Integer sum2 = Stream.of(1, 2, 3).reduce(100, (integer, integer2) -> integer + integer2);
        System.out.println("累加和为：" + sum2);  //累加和为：106
        Integer sum3 = Stream.of(1, 2, 3).parallel().reduce(100, (integer, integer2) -> integer + integer2);
        System.out.println("累加和为：" + sum3);  //累加和为：306
        System.out.println("--------------xxxxxxxxxxxxxxx");
        Optional<Integer> opt = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .reduce(new BinaryOperator<Integer>() {
              @Override
              public Integer apply(Integer acc, Integer n) {
                   return acc + n;
              }
        });
        if (opt.isPresent()) {
            System.out.println("累加和为：" + opt.get());
        }
    }
}
