package packages.part2.staticExample;// import java.lang.reflect.Array;
// import java.util.Arrays;

class Main {
    static class InnerClass{

    }



    public static void main(String[] args) {

        // rool numbers of 5 students
        // int[] rnum = new int[5];
         
        // rnum[3] = 7;
        // System.out.println(rnum[3]);

        // names of 5 students
        
        // String[] names = new String[5];

        // // data of 5 students {name, roll number , mark};

        // Student[] students;
      
        // so at this time class cames to the stage to solve a problem to group different properties and functions together
        
        // Student student1 = new Student(14, "thomas addisu", 95.7f);
        // // student1.rno= 14;
        // // student1.name = "kunal Kushwaha";
        // // student1.marks = 88.0f;
     

        // Student student2 = new Student(15,"kushaa a",92.7f);


    //     System.out.println(student1.rno);
    //     System.out.println(student1.name);
    //     System.out.println(student1.marks);
    //     System.out.println(student2.name);

    //    Student student3 = new Student();

    //     System.out.println(student3.rno);
        // System.out.println(student3.name);
        // System.out.println(student3.marks);

        // Student student4 = new Student(student1);
        
        // System.out.println(student4.rno);
        // System.out.println(student4.name);
        // System.out.println(student4.marks);

//       Integer num1 = new Integer(5);
//        Integer num2 =  4;
//        System.out.println(num2);
//        System.out.println(num1);
//
//        Integer a = 10;
//        Integer b = 20;
//
//
//        swap(a, b);
//        System.out.println(a + " " + b);
//        final int ab = 30;
//        // ab = 30;
//        System.out.println(ab);
//
//        final Integer num = 25;
//        // num = 30;
//        System.out.println(num);
        
//        A obj = new A("Thomasss");
//
//        System.out.println(obj);

        //        message();
        //       System.out.println("done");

//        System.out.println("--------------Start--------------");
//        Human thomas = new Human(21, "thomas", 100, false);
//        Human eyob = new Human(20, "eyob", 50, false);
//        System.out.println(eyob.salary);
//        System.out.println(thomas.isMarried);
//        System.out.println(Human.population);
//        System.out.println(eyob.population);

        System.out.println(StaticBlock.b);
        StaticBlock obj = new StaticBlock();
        obj.b += 3;
        System.out.println(StaticBlock.b);

        InnerClass a = new InnerClass();

    }

     static void fun(){
//        greating is non static methond so you can not accecs inside static method b.c its belongs to object(instance)so you shoud create object to acces it inside static method
//
//        greating();

//        create object to acces it
         Main obj = new Main();
         obj.greating();
     }
     void funny(){
        greating();
     }

     void greating(){
        System.out.println("hellow my world");
    }

//    static void swap(Integer a , Integer b){
//        Integer temp = a;
//        a = b;
//        b = temp;
//        // System.out.println(a + " " + b);
//    }
}  

//class A{
//    final int num = 1;
//    String name;
//
//    public A(String name){
//        this.name = name;
//    }
//}
//
//
//
// create a class for every single student we have 3 properties name, roll number and marks
//    class Student {
//    int rno ;
//    String name;
//    float marks;
//
//    void changeName(String newName){
//        name = newName;
//    }
//
//    Student(Student other){
//        this.rno = other.rno;
//        this.name = other.name;
//        this.marks = other.marks;
//    }
//
//    Student(){
//        this.rno = 14;
//        this.name = "kunhal kusha";
//        this.marks = 90.0f;
//    }
//
//    Student(int rno , String name, float marks){
//        this.rno = rno;
//        this.name =name;
//        this.marks = marks;
//    }
//    }