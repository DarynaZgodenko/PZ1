//Дана матрица (N+15)x(N+15) отсортировать нечетные строки,
  //      числа генерировать случайно в интервале [-N-15; N+15]
import java.util.Scanner;
import java.util.Random;
public class project {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nv = ");
        int N = in.nextInt();

        int[][] array = new int[N + 15][N + 15];

      fill(N,array);
      print(N,array);
      swap(N,array);
      print(N,array);
        in.close();
    }
    public static void print(int N, int array[][]){
        for (int i = 0; i < N + 15; i++) {
            for (int j = 0; j < N + 15; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void fill(int N, int array[][]){
        Random rnd =new Random();
        for (int i = 0; i < N + 15; i++) {
            for (int j = 0; j < N + 15; j++) {
                array[i][j]=(-N-15) + rnd.nextInt(N+15-(-N-15));
            }

        }
    }
    public static void swap(int N, int array[][]){
        for (int i = 0; i < N + 15; i++) {
            for (int j = 0; j < N + 15; j+=2) {
                for (int k = 0; k < N + 14; k++) {
                    if (array[k][j] < array[k+1][j]) {
                        int tmp = array[k][j];
                        array[k][j] = array[k+1][j];
                        array[k+1][j] = tmp;
                    }
                }
            }
        }
    }
    }

