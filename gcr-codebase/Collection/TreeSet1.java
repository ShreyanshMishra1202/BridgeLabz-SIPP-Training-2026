import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    String name;
    int age;
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString(){
        return "Student{name='"+name+"', age="+age+"}";
    }
}

public class TreeSet1 {
    public static void main(String[] args) {

        Set<Student> st=new TreeSet<>();
        Student s1=new Student("Ayush",56);
        Student s2=new Student("Ansh",34);
        Student s3=new Student("Shreyansh",16);
        st.add(s1);
        st.add(s2);
        st.add(s3);

        System.out.println(st);
    }
}