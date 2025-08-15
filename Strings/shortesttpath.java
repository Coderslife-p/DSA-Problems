
public class shortesttpath {
    public static float Shortest(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            }
            // west
            else if (dir == 'N') {
                x--;
            }
            // east
            else if (dir == 'W') {
                x--;
            }
            //north
            else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);

    }

    public static void main(String[] args) {
        String str = "EE";
        System.out.println(Shortest(str));
    }
}
