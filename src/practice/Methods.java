package practice;

public class Methods {

    // "static" method doesn't need to be initialized from an instance
    private static int add(int a, int b) {
        int result = a + b;
        return result;
    }
    // without "static"
    private int sub(int a, int b) {
        int result = a - b;
        return result;
    }
    public static void main(String[] args) {
        int result = add(1, 2);
        System.out.println(result); // 3
        int result2 = add(1, 3);
        System.out.println(result2); // 4

        Methods methods = new Methods();
        System.out.println(methods.sub(3, 2)); // 1
    }
}
