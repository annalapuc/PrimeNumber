public class Main {
    public static void main(String[] args) {
number();

    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=(long)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void number(){
       int count =0;
        for (int i=10; i<50; i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
                if(count==10){
                    System.out.println("close");
                    break;
            }
            }
        }
    }
}
