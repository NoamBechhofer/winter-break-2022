Hello! This readme constitutes some level of documentation for Rational.java
since I don't know javadoc yet. The idea behind Rational is to be able to avoid
truncation issues with floats/doubles. This allows for greater precision. Formal
definition, from Wikipedia: a rational number is a number that can be expressed
as the quotient or fraction (p/q) of two integers, a numerator p and a non-zero
denominator q.
A few notes:
-Rational does not reduce automatically. This needs to be done manually by
calling the appropriate reduce() method.
-The mathematical mutator methods of Rational are overloaded with two methods
each, one static and one non-static.

Remember: num = numerator, den = denominator

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
