import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
  int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  String name;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return name + " " + age;
  }
}

public class Main {
  public static void main(String[] args) {
    var slist = new ArrayList<Student>();

    slist.add(new Student("Dharun", 23));

    slist.add(new Student("Dharun", 30));
    slist.add(new Student("Dharun", 90));
    slist.add(new Student("Dharun", 12));
    slist.add(new Student("Dharun", 25));
    slist.add(new Student("Dharun", 21));

    Collections.sort(slist, Comparator.comparingInt(Student::getAge));

    System.out.println(slist);
  }
}
