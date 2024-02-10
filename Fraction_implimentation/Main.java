import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        try {
            // Test des différents constructeurs
            Fraction frac1 = new Fraction();
            Fraction frac2 = new Fraction(BigInteger.valueOf(3), BigInteger.valueOf(4));
            Fraction frac3 = new Fraction(1, 2);
            Fraction frac4 = new Fraction(-5);
            
            System.out.println("Fractions créées :");
            System.out.println("frac2: " + frac2.toString());
            System.out.println("frac3: " + frac3.toString());
            System.out.println("frac4: " + frac4.toString());

            // Test des opérations arithmétiques
            System.out.println("\nOpérations arithmétiques :");
            Fraction sum = frac2.add(frac3);
            Fraction difference = frac2.sub(frac3);
            Fraction product = frac2.mult(frac3);
            Fraction quotient = frac2.div(frac3);
            System.out.println("Addition : " + sum);
            System.out.println("Soustraction : " + difference);
            System.out.println("Multiplication : " + product);
            System.out.println("Division : " + quotient);

            // Test de conversion en double
            System.out.println("\nConversion en double :");
            System.out.println("frac3 en double : " + frac3.doubleValue());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
