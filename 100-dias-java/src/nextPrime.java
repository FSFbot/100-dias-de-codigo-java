public class nextPrime {
    public static void main(String[] args) {
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));

    }
    public static int nextPrime(int num){
        if (num <= 1) return 2;
        int prime = num;
        boolean found = false;

        while(!found){
            prime++;
            if(isPrime(prime)){
                found = true;
            }
        }
        return prime;
    }

    private static boolean isPrime(int num){
        if(num <=1 ) return false;
        for (int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }

        }
        return true;
    }
}
