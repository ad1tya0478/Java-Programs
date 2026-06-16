public class question_48 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.print(rotate(matrix));
    }
    static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n;i++){
            for(int j = i+1; j < n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i < n;i++){
            int s = 0;
            int r = n - 1;
            while(s < r){
                int t = matrix[i][s];
                matrix[i][s] = matrix[i][r];
                matrix[i][r] = t;
                s++;
                r--;
            }
        }
    }
}
