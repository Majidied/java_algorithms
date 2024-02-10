import java.math.BigInteger;

public class Fraction {
    private BigInteger numerator, denominator;

    Fraction() {
        super();
    }

    Fraction(BigInteger num, BigInteger denom) throws IllegalArgumentException {
        if (denom == null || denom.equals(BigInteger.ZERO)) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        } else if ((num.compareTo(BigInteger.ZERO) > 0 && denom.compareTo(BigInteger.ZERO) > 0) ||
                   (num.compareTo(BigInteger.ZERO) < 0 && denom.compareTo(BigInteger.ZERO) < 0)) {
            this.numerator = num;
            this.denominator = denom;
        } else {
            this.numerator = num.abs();
            this.denominator = denom.abs();
        }
    }

    Fraction(int num, int denom) throws IllegalArgumentException {
        this(BigInteger.valueOf(num), BigInteger.valueOf(denom));
    }

    Fraction(int n) {
        this(BigInteger.valueOf(n), BigInteger.ONE);
        if (n < 0) {
            this.numerator = this.numerator.negate();
        }
    }

    public Fraction add(Fraction b) {
        Fraction r = new Fraction();
        r.numerator = this.numerator.multiply(b.denominator).add(this.denominator.multiply(b.numerator));
        r.denominator = this.denominator.multiply(b.denominator);
        return r;
    }

    public Fraction sub(Fraction b) {
        Fraction r = new Fraction();
        r.numerator = this.numerator.multiply(b.denominator).subtract(this.denominator.multiply(b.numerator));
        r.denominator = this.denominator.multiply(b.denominator);
        return r;
    }

    public Fraction mult(Fraction b) {
        Fraction r = new Fraction();
        r.numerator = this.numerator.multiply(b.numerator);
        r.denominator = this.denominator.multiply(b.denominator);
        return r;
    }

    public Fraction div(Fraction d) {
        Fraction r = new Fraction();
        r.numerator = this.numerator.multiply(d.denominator);
        r.denominator = this.denominator.multiply(d.numerator);
        return r;
    }

    @Override
    public String toString() {
        if (this == null) {
            return "";
        } else if (this.denominator.equals(BigInteger.ONE)) {
            return "" + this.numerator;
        } else {
            return this.numerator + "/" + this.denominator;
        }
    }

    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }
}
