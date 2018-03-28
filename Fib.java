public class Fib {

  // compute the nth fibonacci number
  public static int fib(int n) {

      int sum = 0;

      if(n = 0){
	  return 0;
      }
      if(n = 1){
	  return 1;
      } else{

      sum = fib(n - 1) + fib(n - 2)

      return sum;
      }
      
  }

  public static void main(String[] args) {
    System.out.println(fib(10));
  }
}
