/*
  Noam Bechhofer
  Rational.java - basic rationals with just ints in numerator and denominator*/
public class Rational implements Comparable<Rational> {
  // instance vars
  private int num;
  private int den;

  // constructors
  public Rational(int num, int den)
      throws DivisionByZeroException {
    if (den == 0) {
      throw new DivisionByZeroException();
    }
    this.num = num;
    this.den = den;
  }

  public Rational(int num) {
    this.num = num;
    this.den = 1;
  }

  public Rational(double d) throws NoNegativeNumbersException {
    // whole part
    int wholePart = (int) d;

    // fractional part
    String s = Double.toString(d);
    String[] t = s.split("\\.");
    this.den = Helpers.pow(10, t[1].length());
    int fracPart = Integer.parseInt(t[1]);
    this.num = (wholePart * this.den) + fracPart;
  }

  public Rational(float f) throws NoNegativeNumbersException {
    // whole part
    int wholePart = (int) f;

    // fractional part
    String s = Float.toString(f);
    String[] t = s.split("\\.");
    this.den = Helpers.pow(10, t[1].length());
    int fracPart = Integer.parseInt(t[1]);
    this.num = (wholePart * this.den) + fracPart;
  }

  public int getNum() {
    return this.num;
  }

  public int getDen() {
    return this.den;
  }

  public String toString() {
    return "(" + this.num + ")/(" + this.den + ")";
  }

  public float toFloat() {
    return (float) this.num / this.den;
  }

  public double toDouble() {
    return (double) this.num / this.den;
  }

  public boolean isPositive() {
    if (this.den < 0 ^ this.num < 0) {
      return false;
    }
    return true;
  }

  public int compareTo(Rational r) {
    if (this.getNum() == r.getNum() && this.getDen() == r.getDen()) {
      return 0;
    }
    if (this.toDouble() > r.toDouble()) {
      return 1;
    }
    return -1;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public void setDen(int den) {
    this.den = den;
  }

  public static Rational abs(Rational r) throws DivisionByZeroException {
    int newNum = Math.abs(r.getNum());
    int newDen = Math.abs(r.getDen());

    return new Rational(newNum, newDen);
  }

  public Rational abs() throws DivisionByZeroException {
    return abs(this);
  }

  // add
  public static Rational add(Rational r, Rational s)
      throws DivisionByZeroException {
    // multiply each numerator by the other denominator and add
    int newNum = (r.getNum() * s.getDen()) + (s.getNum() * r.getDen());
    // common denominator
    int newDen = r.getDen() * s.getDen();

    return new Rational(newNum, newDen);
  }

  public Rational add(Rational s) throws DivisionByZeroException {
    return add(this, s);
  }

  // subtract
  public static Rational subtract(Rational r, Rational s)
      throws DivisionByZeroException {
    // multiply each numerator by the other denominator and subtract
    int newNum = (r.getNum() * s.getDen()) - (s.getNum() * r.getDen());
    // common denominator
    int newDen = r.getDen() * s.getDen();

    return new Rational(newNum, newDen);
  }

  public Rational subtract(Rational s) throws DivisionByZeroException {
    return subtract(this, s);
  }

  // multiply
  public static Rational multiply(Rational r, Rational s)
      throws DivisionByZeroException {
    int newNum = r.getNum() * s.getNum();
    int newDen = r.getDen() * s.getDen();

    return new Rational(newNum, newDen);
  }

  public Rational multiply(Rational s) throws DivisionByZeroException {
    return multiply(this, s);
  }

  // divide
  public static Rational divide(Rational r, Rational s)
      throws DivisionByZeroException {
    if (s.getNum() == 0) {
      throw new DivisionByZeroException();
    }
    int newNum = r.getNum() * s.getDen();
    int newDen = r.getDen() * s.getNum();

    return new Rational(newNum, newDen);
  }

  public Rational divide(Rational s)
      throws DivisionByZeroException {
    return divide(this, s);
  }

  // power
  public static Rational pow(Rational base, int exp)
      throws NoNegativeNumbersException, DivisionByZeroException {
    if (exp == 1) {
      return base;
    }
    if (exp == 0) {
      return new Rational(1);
    }
    int newNum = base.getNum();
    int newDen = base.getDen();
    if (exp < 0) {
      // swap num and den
      int temp = newNum;
      newNum = newDen;
      newDen = temp;
      exp = Math.abs(exp);
    }

    newNum = Helpers.pow(newNum, exp);
    newDen = Helpers.pow(newDen, exp);

    return new Rational(newNum, newDen);
  }

  public Rational pow(int exp)
      throws NoNegativeNumbersException, DivisionByZeroException {
    return pow(this, exp);
  }

  // reduce (e.g. -10/-4 -> 5/2) - recursive
  public static Rational reduce(Rational r) throws DivisionByZeroException {
    int gcf = 1;
    for (int i = 1; i <= r.getNum() && i <= r.getDen(); i++) {
      if (r.getNum() % i == 0 && r.getDen() % i == 0) {
        gcf = i;
      }
    }
    if (gcf == 1) {
      return r;
    }
    int newNum = r.getNum() / gcf;
    int newDen = r.getDen() / gcf;
    Rational.reduce(new Rational(newNum, newDen));
    if (r.getNum() < 0 && r.getDen() < 0) {
      r.setNum(Math.abs(r.getNum()));
      r.setDen(Math.abs(r.getDen()));
    }

    return new Rational(newNum, newDen);
  }

  public Rational reduce() throws DivisionByZeroException {
    return reduce(this);
  }

}
