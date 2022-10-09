
public class TransopeMatrix {

    public static void main(String[] args) {
        int[][] matrixx = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] transposeMatrixx = new int[3][3];

        for (int i = 0; i < matrixx.length; i++) {
            for (int j = 0; j < transposeMatrixx.length; j++) {
                System.out.print(matrixx[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Doing Transpose");

        for (int i = 0; i < matrixx.length; i++) {
            for (int j = 0; j < transposeMatrixx.length; j++) {
                transposeMatrixx[i][j] = matrixx[j][i];
                System.out.print(transposeMatrixx[i][j] + " ");
            }
            System.out.println();
        }
    }
}