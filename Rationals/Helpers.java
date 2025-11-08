public class Helpers {
  // integer power operations - no doubles. Positives only.
  public static int pow(int a, int b) throws NoNegativeNumbersException {
    if (b < 0) {
      throw new NoNegativeNumbersException();
    }
    if (b == 0) {
      return 1;
    }
    if (b == 1) {
      return a;
    }
    int result = a;
    for (int i = 1; i < b; i++) {
      result *= a;
    }
    return result;
  }
}
