import java.util.Scanner;

public class matrix {
    private  int n , m;
    private int[][] dp;


    matrix(){}
    matrix(int n , int m){
        this.n = n;
        this.m = m;
        dp = new int[this.n][this.m];
    }

    matrix(int n , int m , int[][] dp){
        this.n = n;
        this.m = m;
        this.dp = dp;
    }

    public void nextMatrix(Scanner cs){
        for (int i = 0 ;i < n ;i++){
            for (int j =0 ;j < m ;j++){
                dp[i][j] = cs.nextInt();
            }
        }

    }

    public matrix mul(matrix b){
        int rowS = this.n;
        int colS = b.m;
        int[][] res = new int[rowS][colS];
        for (int i =0 ;i < rowS ; i++){
            for (int j =0 ; j < colS ; j++){
                res[i][j] = 0;
                for (int k= 0 ; k < this.m ; k++){
                    res[i][j] += dp[i][k] * b.dp[k][j];
                }
            }
        }
        return new matrix(rowS , colS , res);
    }


    @Override
    public String toString(){
        String res = "";
        for (int i =0 ;i <n ; i++){
            for (int j =0 ; j < m ;j++){
                res += dp[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }




}
