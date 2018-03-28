public class Fib {

  // compute the nth fibonacci number
  public static int fib(int n) {
      if(n = 0){
	  return 0;
      }
      if(n = 1){
	  return 1;
      }
      else{
	  return fib(n - 1) + fib(n);
      }
  }

  public static void main(String[] args) {
    System.out.println(fib(10));
  }
}
