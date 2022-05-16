/**
 * Basic rational numbers. Numerator and denominator are restricted to integers.
 * 
 * The idea behind Rational is to be able to avoid truncation issues with
 * floats/doubles. This allows for greater precision. Formal definition, from
 * Wikipedia: a rational number is a number that can be expressed as the
 * quotient or fraction (p/q) of two integers, a numerator p and a non-zero
 * denominator q.
 * Note: Reducing rationals is a non-constant process interms of time-complexity
 * (A simple big o analysis yields a worst case O(n^2), average case O(n)
 * time-complexity, where n = max(numerator, denominator)). In a previous
 * iteration, reducing was left for the user to do at will. However, I have
 * decided that the user should not have to bother with this. The fact that
 * reducing needs to be done is a factor to consider when choosing whether to
 * use floats or Rationals.
 * 
 * @author Noam Bechhofer
 */
public class Rational implements Comparable<Rational> {
  /** Numerator */
  private int num;
  /** Denominator */
  private int den;

  /**
   * Constructor for an explict numerator and denominator
   * 
   * @param num the numerator
   * @param den the denominator
   * @ if the denominator is set to 0
   */
  public Rational(int num, int den) {
    if (den == 0) {
      throw new DivisionByZeroException();
    }

    this.num = num;
    this.den = den;

    reduce(this);
  }

  /**
   * Construct a Rational from an {@link int}
   * 
   * @param num the int which this Rational will be equivalent to
   */
  public Rational(int num) {
    this.num = num;
    this.den = 1;
  }

  /**
   * Construct a Rational from a {@link double}
   * 
   * @param d the double which this Rational will be equivalent to
   */
  public Rational(double d) {
    int wholePart = (int) d;

    // fractional part
    String s = Double.toString(d);
    String[] t = s.split("\\.");
    this.den = (int) Math.pow(10, t[1].length());
    int fracPart = Integer.parseInt(t[1]);
    this.num = (wholePart * this.den) + fracPart;

    reduce(this);
  }

  /**
   * Getter for the numerator
   * 
   * @return this Rational's numerator
   */
  public int num() {
    return this.num;
  }

  /**
   * Getter for the denominator
   * 
   * @return this Rational's denominator
   */
  public int den() {
    return this.den;
  }

  /**
   * toString override
   */
  public String toString() {
    return "(" + this.num + ")/(" + this.den + ")";
  }

  /**
   * convert this Rational to a {@link float}
   * 
   * @return the float
   */
  public float toFloat() {
    return (float) this.num / this.den;
  }

  /**
   * convert this Rational to a {@link double}
   * 
   * @return the double
   */
  public double toDouble() {
    return (double) this.num / this.den;
  }

  /**
   * Compares this Rational to another Rational
   * 
   * @param r the other Rational, not null
   * @return the comparator value, negative if less, positive if greater.
   */
  public int compareTo(Rational r) {
    if (r == null)
      throw new NullPointerException();
    if (this.num() == r.num() && this.den() == r.den()) {
      return 0;
    }
    if (this.toDouble() > r.toDouble()) {
      return 1;
    }
    return -1;
  }

  /**
   * Internal method to change this Rational's numerator
   * 
   * @param num the new numerator
   */
  private void setNum(int num) {
    this.num = num;
  }

  /**
   * Internal method to change this Rational's denominator
   * 
   * @param den the new denominator
   */
  private void setDen(int den) {
    this.den = den;
  }

  /**
   * The absolute value of a Rational
   * 
   * @param r the Rational
   * @return the absolute value of {@code r}
   */
  public static Rational abs(Rational r) {
    int newNum = Math.abs(r.num());
    int newDen = Math.abs(r.den());

    return new Rational(newNum, newDen);
  }

  /**
   * The absolute value of this Rational
   * 
   * @return the absolute value
   */
  public Rational abs() {
    return abs(this);
  }

  /**
   * Internal method to functionally decompose the process of constructing and
   * reducing a Rational before returning it.
   * 
   * @param numerator   the numerator
   * @param denominator the denominator
   * @return the reduced Rational constructed from the parameters
   */
  private static Rational reduceAndReturn(int numerator, int denominator) {
    Rational tmp = new Rational(numerator, denominator);
    reduce(tmp);

    return tmp;
  }

  /**
   * Add two Rationals
   * 
   * @param r the first addend
   * @param s the second added
   * @return the sum
   */
  public static Rational add(Rational r, Rational s) {
    // multiply each numerator by the other denominator and add
    int newNum = (r.num() * s.den()) + (s.num() * r.den());
    // common denominator
    int newDen = r.den() * s.den();

    return reduceAndReturn(newNum, newDen);
  }

  // rename to plus(Rational s)? Same with all the non-static operations?
  /**
   * Add a Rational to this Rational
   * 
   * @param s the Rational to be added
   * @return the sum
   */
  public Rational add(Rational s) {
    return add(this, s);
  }

  /**
   * Subtract one Rational from another
   * 
   * @param r the minuend
   * @param s the subtrahend
   * @return the difference
   */
  public static Rational subtract(Rational r, Rational s) {
    // multiply each numerator by the other denominator and subtract
    int newNum = (r.num() * s.den()) - (s.num() * r.den());
    // common denominator
    int newDen = r.den() * s.den();

    return reduceAndReturn(newNum, newDen);
  }

  /**
   * Subtract a Rational from this Rational
   * 
   * @param s the subtrahend
   * @return the difference
   */
  public Rational subtract(Rational s) {
    return subtract(this, s);
  }

  /**
   * Multiply two Rationals
   * 
   * @param r the multiplicand
   * @param s the multiplier
   * @return the product
   */
  public static Rational multiply(Rational r, Rational s) {
    int newNum = r.num() * s.num();
    int newDen = r.den() * s.den();

    return reduceAndReturn(newNum, newDen);
  }

  /**
   * Multiply this Rational by another Rational
   * 
   * @param s the multiplier
   * @return the product
   */
  public Rational multiply(Rational s) {
    return multiply(this, s);
  }

  /**
   * Divide two Rationals
   * 
   * @param r the dividend
   * @param s the divisor
   * @return the quotient
   */
  public static Rational divide(Rational r, Rational s) {
    if (s.num() == 0) {
      throw new DivisionByZeroException();
    }
    int newNum = r.num() * s.den();
    int newDen = r.den() * s.num();

    return reduceAndReturn(newNum, newDen);
  }

  /**
   * Divide this Rational by another Rational
   * 
   * @param s the divisor
   * @return the quotient
   */
  public Rational divide(Rational s) {
    return divide(this, s);
  }

  /**
   * Exponentiate a Rational and an {@link int}
   * 
   * @param base the base
   * @param exp  the exponent
   * @return the power
   */
  public static Rational pow(Rational base, int exp) {
    if (exp == 1) {
      return base;
    }
    if (exp == 0) {
      return new Rational(1);
    }

    int newNum = base.num();
    int newDen = base.den();

    if (exp < 0) {
      // swap num and den
      int temp = newNum;
      newNum = newDen;
      newDen = temp;
      exp = Math.abs(exp);
    }

    newNum = (int) Math.pow(newNum, exp);
    newDen = (int) Math.pow(newDen, exp);

    return reduceAndReturn(newNum, newDen);
  }

  /**
   * Raise this Rational to an exponent
   * 
   * @param exp the exponent
   * @return the power
   */
  public Rational pow(int exp) {
    return pow(this, exp);
  }

  /**
   * Internal method to reduce a Rational.
   * O(n^2) where n = max(numerator, denominator)
   * 
   * @param r the Rational to be reduced
   * @return the reduced Rational
   */
  private static void reduce(Rational r) {
    int gcf = 1;
    for (int i = 1; i <= r.num() && i <= r.den(); i++) {
      if (r.num() % i == 0 && r.den() % i == 0) {
        gcf = i;
      }
    }
    if (gcf == 1) {
      return;
    } // base case
    int newNum = r.num() / gcf;
    int newDen = r.den() / gcf;
    r = new Rational(newNum, newDen);
    reduce(r);
    if (r.num() < 0 && r.den() < 0) {
      r.setNum(Math.abs(r.num()));
      r.setDen(Math.abs(r.den()));
    }
  }

}
