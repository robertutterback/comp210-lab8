public class Fib {

  // compute the nth fibonacci number
  public static int fib(int n) {
      return fib(n-1)+fib(n-2);
  }

  public static void main(String[] args) {
    System.out.println(fib(10));
  }
}
