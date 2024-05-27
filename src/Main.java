import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вершина А");
        System.out.print("X = ");
        int XA = in.nextInt();
        System.out.print("Y = ");
        int YA = in.nextInt();
        System.out.println("Вершина В");
        System.out.print("X = ");
        int XB  = in.nextInt();
        System.out.print("Y = ");
        int YB = in.nextInt();
        System.out.println("Вершина С");
        System.out.print("X = ");
        int XC  = in.nextInt();
        System.out.print("Y = ");
        int YC = in.nextInt();
        search_length(XA, YA, XB, YB,XC, YC, in);

        //System.out.print();
        in.close();
    }

    public static void search_length(int xA, int yA,int xB, int yB,int xC, int yC, Scanner in){
        int k = 0;
        do {
            System.out.println("Точка в треугольнике");
            System.out.print("X = ");
           int x0 = in.nextInt();
            System.out.print("Y = ");
            int y0 = in.nextInt();

            int a = (xA - x0) * (yB - yA) - (xB - xA) * (yA - y0);
            int b = (xB - x0) * (yC - yB) - (xC - xB) * (yB - y0);
            int c = (xC - x0) * (yA - yC) - (xA - xC) * (yC - y0);

            if ((a > 0 && b > 0 && c > 0) || (a < 0 && b < 0 && c < 0)) {
                double AB_length = Math.sqrt(Math.pow((((xA + xB) / 2) - x0), 2) + Math.pow((((yA + yB) / 2) - y0), 2));
                double BC_length = Math.sqrt(Math.pow((((xB + xC) / 2) - x0), 2) + Math.pow((((yB + yC) / 2) - y0), 2));
                double AC_length = Math.sqrt(Math.pow((((xA + xC) / 2) - x0), 2) + Math.pow((((yA + yC) / 2) - y0), 2));
                if (AB_length < BC_length && AB_length < AC_length) {
                    System.out.print("Ближайшая середина стороны к данной точке - середина стороны АВ = " + AB_length);
                } else if (BC_length < AB_length && BC_length < AC_length) {
                    System.out.print("Ближайшая середина стороны к данной точке - середина стороны BC = " + BC_length);
                } else {
                    System.out.print("Ближайшая середина стороны к данной точке - середина стороны AC = " + AC_length);
                }
                k = 0;
            } else if (a == 0 || b == 0 || c == 0) {
                System.out.println("Точка  лежит на стороне треугольника");
                k = 1;
            } else {
                System.out.print("Точка не лежит в треугольнике");
                k = 1;
            }
            System.out.println();
        } while (k == 1);
    }
}
