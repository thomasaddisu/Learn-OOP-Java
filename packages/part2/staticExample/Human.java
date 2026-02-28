package packages.part2.staticExample;

public class Human {
    public int age;
    public String name;
    public int salary;
    public boolean isMarried;
    public static int population;


    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1;
    }


}
