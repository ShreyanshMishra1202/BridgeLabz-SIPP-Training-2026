import java.util.Scanner;

class Fruit<D>{
    D value;

    void setValue(D value) {
        this.value = value;
    }

    D getValue() {
        return value;
    }
}

class Box<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box<String> b1 = new Box<>();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        b1.setValue(name);

        System.out.println("Name = " + b1.getValue());

        Box<Integer> b2 = new Box<>();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        b2.setValue(age);

        System.out.println("Age = " + b2.getValue());

        System.out.println(Box<Integer> extend Fruit<String>);

        sc.close();
    }
}