
import java.util.*;
public class Arraylist_work {

    static class Emp {
        String id;
        String name;
        int salary;

        Emp(String id, String name, int salary){
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString(){
            return "Emp{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", salary=" + salary + '}';
        }
    }

    public static void main(String[] args) {
        ArrayList<Emp> al = new ArrayList<>();
        System.out.println(al);
        System.out.println(al.add(new Emp("123","Ravi",10000)));
    }
}
