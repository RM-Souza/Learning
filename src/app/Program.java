package app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n, n1;

        //entrada de dados
        m = sc.nextInt();
        n = sc.nextInt();

        Integer[][] mat = new Integer[m][n];

        //criando matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        n1 = sc.nextInt(); //inserindo numero

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == n1) {
                    System.out.println("Position: (" + i + ", " + j + "):");
                    if (i > 0) { //up
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i < mat.length-1) { //down
                        System.out.println("Down: " + mat[i + 1][j]); //estudar saidas
                    }
                    if (j > 0) { //left
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j < mat[i].length-1) { //right
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                }
            }
        }
        sc.close();
    }
}

