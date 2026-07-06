import java.util.Scanner;

class Shape<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape<String> b1 = new Shape<>();

        System.out.print("Enter Shape: ");
        String shape = sc.nextLine();

        b1.setValue(shape);

        System.out.println("Shape = " + b1.getValue());

        Shape<Integer> b2 = new Shape<>();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        b2.setValue(age);

        System.out.println("Age = " + b2.getValue());

        sc.close();
    }
}