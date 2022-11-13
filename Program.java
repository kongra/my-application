class Program {

  /**
   * Computes n-th element of Fibonacci sequence.
   */
  static long fib(long n) {
    if (n == 0 || n == 1) {
      return n;
    }
    else {
      return fib(n-1) + fib(n-2);
    }
  }

  public static void main(String[] args) {
    for (int n = 0; n < 10; n++) {
      long value = fib(n);
      System.out.println(n + "-th element is " + value);
    }
  }

}
