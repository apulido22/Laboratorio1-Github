public class FibonacciSequence {

    public static void main(String[] args) {
        int limit = 10;
        int n1 = 0, n2 = 1;

        System.out.println("Secuencia de Fibonacci hasta el número 10:");

        while (n1 <= limit) {
            System.out.print(n1 + " ");
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
    }
}