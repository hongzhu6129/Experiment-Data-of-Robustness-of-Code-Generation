public class Staircase {

    public static void main(String[] args) {
        int n = 6; // Example value for n
        int k = 2; // Example value for k

        int currentRow = 1;
        int coinsUsed = 0;

        while (coinsUsed < n) {
            if (currentRow % k == 0) {
                // k-th row, print k coins
                if (coinsUsed + currentRow <= n) {
                    for (int i = 0; i < currentRow; i++) {
                        System.out.print("O ");
                    }
                    coinsUsed += currentRow;
                    System.out.println(); 
                } else {
                    //If not enough coins left to make a full k-th row
                    int remainingCoins = n - coinsUsed;
                    for(int i=0; i < remainingCoins; i++){
                        System.out.print("O ");
                    }
                    coinsUsed = n; //All coins used
                    System.out.println();
                }


            } else {
                // Not a k-th row, print currentRow coins if possible
                if(coinsUsed + currentRow <=n){
                     for(int i=0; i < currentRow; i++){
                        System.out.print("O ");
                    }
                    coinsUsed+=currentRow;
                    System.out.println();
                }else{
                    //If not enough coins left to make a full regular row
                    int remainingCoins = n- coinsUsed;
                    for(int i=0; i < remainingCoins; i++){
                        System.out.print("O ");
                    }
                    coinsUsed = n; //All coins used
                     System.out.println();
                }
                
            }
             currentRow++; 
        }
    }
}
