import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix A");
        int rowsA = Matrix.inputInt(scan);
        System.out.println("Enter the number of columns in matrix A");
        int columnsA = Matrix.inputInt(scan);
        boolean f = false;
        int rowsB;
        do {
            System.out.println("Enter the number of rows in matrix B");
            rowsB = Matrix.inputInt(scan);
            if (columnsA == rowsB) {
                f = true;
            }
            else {
                System.out.println("The number of columns in matrix A should be equal to the number of rows in matrix B");;
            }
        } while (!f);
        System.out.println("Enter the number of columns in matrix B");
        int columnsB = Matrix.inputInt(scan);
        System.out.println("The size of the matrix A is ("+rowsA+":"+columnsA+")");
        long[][] A = Matrix.fill_matrix(rowsA, columnsA);

        System.out.println("The size of the matrix B is ("+rowsB+":"+columnsB+")");
        long[][] B = Matrix.fill_matrix(rowsB, columnsB);
//        long[][] A = {
//                {1000L, 2700L, -5435345L, -66456L, -435352L},
//                {4363463L, 36456L, 3253245L, -63645L, 3765753L},
//                {2346L, -1345145L, 645646L, 236465L, 73756L},
//                {35342523L, 6346456L, -3253245L, 123412L, 5546436L}
//        };
//        long[][] B = {
//                {13454325L, 6245624L, 31543153L, 6452642L, 13513L, 6425624L, 2345432L},
//                {6462456L, 1345L, 2L, 42L, 53L, 53653L, 235L},
//                {63423L, 543L, 345L, 642L, 645L, 645L, 36L},
//                {23624L, 3L, 5132L, 5534L, 36L, 645L, 346L},
//                {346L, 45L, 64L, 34L, 65L, 35L, 65L}
//        };
//
//        long[][] A = {
//                {12, 45, -67, -89, 23},
//                {34, 56, 78, -90, 11},
//                {22, 33, 44, -55, 66},
//                {77, 88, 99, 20, 21}
//        };
//
//        long[][] B = {
//                {10, 21, 32},
//                {43, 54, 65},
//                {-76, 87, 98},
//                {29, -30, 31},
//                {99, 88, 77}
//        };
        System.out.println("The A matrix is:");
        Matrix.showMatrix(A);
        System.out.println();
        System.out.println("The B matrix is:");
        Matrix.showMatrix(B);

        long[][] result = Matrix.multiply(A, B);
        if (result != null) {
            System.out.println("The result matrix is:");
            Matrix.showMatrix(result);
            Matrix.add(result);
        }
    }
}