public class HW {
    public static void drawTriangle (int N) {
        int x = 1;
        while (x <= N) {
            int y = x;
            while (y >= 1) {
                if (y == 1) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }

                y = y - 1;
            }
            x = x + 1;
        }
    }
        public static void main (String[]args){
            drawTriangle(10);
        }

}