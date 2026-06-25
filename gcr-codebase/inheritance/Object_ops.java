
public class Object_ops {
    int a,b;

    @Override
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Object_ops)) {
            return false;
        }
        Object_ops other = (Object_ops) obj2;
        return this.a == other.a && this.b == other.b;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Object_ops{a=" + a + ", b=" + b + "}";
    }

    public static void main(String[] args) {
        Object_ops obj = new Object_ops();
        obj.a=20;
        obj.b=30;
        System.out.println(obj);

        Object_ops obj1 = new Object_ops();
        obj1.a = 20;
        obj1.b = 30;
        System.out.println(obj1);

        

        System.out.println("Hashcode of obj: " + obj.hashCode());
        System.out.println("Hashcode of obj1: " + obj1.hashCode());

        
        System.out.println("Are obj and obj1 equal? " + obj.equals(obj1));
        System.out.println("Are obj and obj1 the same object? " + (obj == obj1));
        System.out.println("Are obj and obj1 the same object? " + (obj.hashCode() == obj1.hashCode()));
    }
}
