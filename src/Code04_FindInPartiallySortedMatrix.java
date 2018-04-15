public class Code04_FindInPartiallySortedMatrix {
    public static void main(String[] args) {
        int[][] matrixs = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(findNum(matrixs, matrixs.length, matrixs[0].length, 6));
    }

    public static boolean findNum(int[][] matrix, int rows, int columns, int number) {
        boolean result = false;
        if (matrix != null && rows > 0 && columns > 0) {
            int row = 0;
            int column = columns - 1;
            while (row < rows && column >= 0) {
                if (matrix[row][column] == number) {
                    result = true;
                    break;
                } else if (matrix[row][column] > number) {
                    --column;
                } else {
                    ++row;
                }

            }
        }
        return result;
    }
}
