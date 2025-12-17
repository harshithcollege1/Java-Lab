public class Demo {
    public static void main(String[] args) {
        try {
            Father f = new Father(-12);
            Son s = new Son(45, 20);
            System.out.println("Father age: " + f.age);
            System.out.println("Son age: " + s.sonAge);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}   