package literateProgramming;

class PrimeGenerator {
    private int numPrimes;

    public PrimeGenerator(int numPrimes) {
        this.numPrimes = numPrimes;
    }

    public int[] generate() {
        int candidatePrime = 1;
        int lastPrimeIndex = 1;
        int[] primes = new int[numPrimes + 1];
        primes[1] = 2;
        int ORD = 2;
        int nextPrimeSquare = 9;

        int N = 0;
        final int ORDMAX = 30;
        int[] multiples = new int[ORDMAX + 1];
        while (lastPrimeIndex < numPrimes) {
            boolean maybePrime;
            do {
                candidatePrime += 2;
                if (candidatePrime == nextPrimeSquare) {
                    ORD++;
                    nextPrimeSquare = primes[ORD] * primes[ORD];
                    multiples[ORD - 1] = candidatePrime;
                }
                N = 2;
                maybePrime = true;
                while (N < ORD && maybePrime) {
                    while (multiples[N] < candidatePrime)
                        multiples[N] += primes[N] + primes[N];
                    if (multiples[N] == candidatePrime)
                        maybePrime = false;
                    N++;
                }
            } while (!maybePrime);
            lastPrimeIndex++;
            primes[lastPrimeIndex] = candidatePrime;
        }
        return primes;
    }
}
