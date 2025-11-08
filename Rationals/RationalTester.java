public class RationalTester {
  public static void main(String[] args)
      throws NoNegativeNumbersException, DivisionByZeroException {
    Rational a = new Rational(10, 37);
    Rational b = new Rational(11, 42);
    Rational c = new Rational(5);
    Rational d = new Rational(3.1415);
    System.out.println(d.getNum());
    System.out.println(d.getDen());
    System.out.println(d);
    System.out.println(d.toDouble());
    System.out.println(Rational.add(a, b));
    System.out.println(Rational.subtract(a, b));
    System.out.println(Rational.multiply(a, b));
    System.out.println(Rational.divide(a, b));
    System.out.println(Rational.pow(a, 2));
    System.out.println(Rational.reduce(d));
    System.out.println("---------------------");
    System.out.println(Math.PI);
    Rational pi = new Rational(3.14159265);
    System.out.println(pi);
    pi = Rational.reduce(pi);
    System.out.println(pi);
    System.out.println(pi.toDouble());
  }
}
