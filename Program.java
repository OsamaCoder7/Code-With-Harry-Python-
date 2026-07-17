class Program {
    public static void main (String [] args) {
        // Farz karo do matrices hain: A aur B. Aur result store karne ke liye hai C.
int[][] A = {{1, 2}, {3, 4}};
int[][] B = {{5, 6}, {7, 8}};
int[][] C = new int[2][2]; // Isme answer save hoga

// Asal Game yahan se shuru hoti hai:
for (int i = 0; i < 2; i++) {         // 1. Matrix A ki Rows ke liye
    for (int j = 0; j < 2; j++) {     // 2. Matrix B ke Columns ke liye
        C[i][j] = 0;                  // Pehle khane ko khaali (0) kiya
        System.out.println();
        
        for (int k = 0; k < 2; k++) { // 3. Yeh loop asal multiplication aur sum karega
            C[i][j] += A[i][k] * B[k][j]; 
        }
    }
}
    }
}