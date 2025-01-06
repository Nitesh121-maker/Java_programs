public class OnetoHundred {
    static boolean isPrime(int n){
          if (n<=1) {
            return false;
          }
        //   Check is prime or not and return the boolean value
        for(int i=2; i<n; i++){
            if(n%2==0){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args){
        System.out.println("Prime numbers between 1 and 100:");
        for(int i=1;i<=100;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
}
