public class Tilling {
    public static int tilling(int n){
        if(n == 0 || n == 1)
        {
            return 1;
        }
        
        int verticalTiles = tilling(n-1);//vertical
        int horizonatlTiles = tilling(n-2);//horizontal
        int totalWays = verticalTiles + horizonatlTiles;
        return totalWays;
    }
   public static void main(String[] args) {
    System.out.println(tilling(4));
   } 
}
