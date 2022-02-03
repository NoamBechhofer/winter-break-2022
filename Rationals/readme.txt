Hello! This readme constitutes some level of documentation for Rational.java
since I don't know javadoc yet. Ok the idea behind Rational is to be able to
avoid truncation issues with floats/doubles. How much utility does this serve?
Not much, but I thought it would be a cool project to do. A few notes:
-Rationals should work just fine with negatives, though I have not tested this
extensively.
-Rationals do not reduce automatically. You'll need to do this manually if you
wish to do so by calling the appropriate reduce() method.
-The mathematical mutator methods of Rational are overloaded with two methods
each, one static and one non-static. This may be bad practice, but if it is I
don't yet see a reason why.

Ok, let's just get right into it. Remember: num = numerator, den = denominator

CONSTRUCTORS
public Rational(int num, int den)
public Rational(int num)
  stores an int as a rational - denominator will be 1.
public Rational(double d)
public Rational(float f)

ACCESSOR METHODS
public int getNum()
public int getDen()
public String toString()
public float toFloat()
public double toDouble()
public boolean isPositive()
public int compareTo(Rational r)

MUTATOR METHODS
public void setNum(int num)
public void setDen(int den)
public static Rational abs(Rational r)
public Rational abs()
public static Rational add(Rational r, Rational s)
public Rational add(Rational s)
public static Rational subtract(Rational r, Rational s)
public Rational subtract(Rational s)
public static Rational multiply(Rational r, Rational s)
public Rational multiply(Rational s)
public static Rational divide(Rational r, Rational s)
public Rational divide(Rational s)
public static Rational pow(Rational base, int exp)
public Rational pow(int exp)
public static Rational reduce(Rational r)
public Rational reduce()
