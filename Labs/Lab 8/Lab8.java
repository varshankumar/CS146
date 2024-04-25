public class Lab8 {
    public int coinChange(int[] coins, int amount) {
        int[] change=new int[amount+1];
        for(int i=0;i<change.length;i++){
            change[i]=amount+1;
        }
        change[0]=0;
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(coin<=i){
                    if(change[i]>change[i-coin]+1){
                        change[i]=change[i-coin]+1;
                    }
                }
            }
        }
        if(change[amount]<=amount){
            return change[amount];
        }
        return -1;
    }
    public static void main(String[] args) {
        int coins[]={1,2,5};
        int amount=11;
        Lab8 obj=new Lab8();
        System.out.println(obj.coinChange(coins, amount));
    }
}