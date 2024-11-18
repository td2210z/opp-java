import java.util.Scanner;

public class Matrix {

    private int n , m;
    private int[][] matrix;

    Matrix(int n , int m){
        this.n = n;
        this.m = m;
        matrix = new int[this.n][this.m];
    }

    Matrix(int n , int m , int[][] matrix){
        this.n = n;
        this.m = m;
        this.matrix = matrix;
    }


    public void nextMatrix(Scanner cs){
        for (int i =0 ;i < n ;i++){
            for (int j = 0 ; j < m ;j++){
                matrix[i][j] = cs.nextInt();
            }
        }
    }

    public Matrix trans() {
        int row = this.m;  // Số hàng của ma trận chuyển vị sẽ là số cột của ma trận gốc
        int col = this.n;  // Số cột của ma trận chuyển vị sẽ là số hàng của ma trận gốc
        int[][] v = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                v[i][j] = this.matrix[j][i];  // Đảo vị trí của i và j để thực hiện chuyển vị
            }
        }
        return new Matrix(row, col, v);
    }


    public Matrix mul(Matrix res){
        int rowS = this.n;
        int colS = res.m;
        int[][] v = new int[rowS][colS];
        for (int i =0 ; i < rowS; i++){
            for (int j = 0 ; j < colS ; j++){
                v[i][j] = 0;
                for (int k =0 ; k < this.m ;k++){
                    v[i][j] += this.matrix[i][k] * res.matrix[k][j];
                }
            }
        }
        return new Matrix(rowS , colS , v);
    }

    @Override
    public String toString(){
        String res = "";
        for (int i =0 ;i < n ;i++){
            for (int j =0 ;j < m ;j++){
                res += matrix[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
}
