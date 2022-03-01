package Arrays;

public class Example3 {

    public static void main(String[] args) {

        int[][] secondMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                secondMatrix[i][j] = secondMatrix[i][j] * secondMatrix[i][j];
            }
        }

        for (int i=0; i<secondMatrix.length; i++) {
            for (int j=0; j<secondMatrix[i].length; j++) {
                System.out.println(secondMatrix[i][j]);
            }
        }
    }
}
