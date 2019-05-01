package literateProgramming;


public class PrimePrinter {
    public static void main(String[] args) {
        final int numPrimes = 1000;
        int[] primeGenerator = new PrimeGenerator(numPrimes).generate();
        NumberPrinter numberPrinter = new NumberPrinter(4, 50);
        numberPrinter.print(numPrimes, primeGenerator);
    }

}
