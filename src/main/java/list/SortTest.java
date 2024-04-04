package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<Person> listA = new ArrayList<Person>();
        listA.add(new Person(2,"B"));
        listA.add(new Person(4,"C"));
        listA.add(new Person(3,"A"));
        Collections.sort(listA,  new  Comparator<Person>() {
            /**
             　　　　　　* 升序排的话就是第一个参数.compareTo(第二个参数);
             　　　　　　* 降序排的话就是第二个参数.compareTo(第一个参数);
             　　　　　　*/
            public  int  compare(Person arg0, Person arg1) {
                return  arg0.getId().compareTo(arg1.getId());
            }
        });
        System.out.print(listA);
        Collections.sort(listA,  new  Comparator<Person>() {
            /**
             　　　　　　* 升序排的话就是第一个参数.compareTo(第二个参数);
             　　　　　　* 降序排的话就是第二个参数.compareTo(第一个参数);
             　　　　　　*/
            public  int  compare(Person arg0, Person arg1) {
                return  arg0.getOrder()-arg1.getOrder();
            }
        });
        System.out.print(listA);
    }
}
