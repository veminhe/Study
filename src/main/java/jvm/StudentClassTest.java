package jvm;

public class StudentClassTest {
//    public static void main(String[] args) {
////        Class<Student> studentClass = Student.class;
//        Student stu1 = new Student();
//        Student stu2 = new Student();
//        Student stu3 = new Student();
//
//        System.out.println(stu1);
//        System.out.println(stu2);
//        System.out.println(stu3);
//
//        System.out.println("------------------");
//
//        System.out.println(stu1.getClass());
//        System.out.println(stu2.getClass());
//        System.out.println(stu3.getClass());
//    }

    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.getClassLoader());//AppClassLoader
        System.out.println(studentClass.getClassLoader().getParent());//ExtClassLoader
        System.out.println(studentClass.getClassLoader().getParent().getParent());//null 1、不存在 2、java程序获取不到（如用C++写的，java就获取不到，如线程中的new Thread().start底层还是调用一个native修饰的start0()，native修饰就表示java处理不了，要用c++处理）
    }
}
