public class boundaryelements {

    public static void Boundary(int arr[][]) {
        int rs = 0;
        int re = arr.length-1;
        int cs = 0;
        int ce = arr[0].length-1;
       //top
            for (int j = cs; j <= ce; j++) {
                System.out.println(arr[0][j]);
            }
            //right
            for (int i = rs+1; i <= re; i++) {
                System.out.println(arr[i][ce]);
            }
            //bottom
            if(rs<re){
            for (int j = ce-1; j >= cs; j--) {
                System.out.println(arr[re][j]);
            }}
            //left
            if(cs<ce){
            for (int i = re-1; i >= rs+1; i--) {
                System.out.println(arr[i][cs]);
            }}
        }
    

    public static void main(String[] args) {
      int arr[][] = { 
    {  1,  2,  3,  4 },
    {  5,  6,  7,  8 },
    {  9, 10, 11, 12 },
    { 13, 14, 15, 16 }
};
 Boundary(arr);
    } 

}
