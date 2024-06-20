import java.util.*;
import java.io.*;
public class Main {
    static HashSet<Character> individual = new HashSet<Character>();
    static HashSet<HashSet<Character>> duo = new HashSet<HashSet<Character>>();
    final static int length = 3;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("tttt.in"));
        PrintWriter fr = new PrintWriter("tttt.out");
        char[][] board = new char[length][length];

        for (int i = 0; i < length; i++) {
            String temp = br.readLine();
            for (int j = 0; j < length; j++) {
                board[i][j] = temp.charAt(j);
            }
        }
        for (char[] x : board) {
            checkWin(x[0],x[1],x[2]);
        }
        checkWin(board[0][0], board[1][0], board[2][0]);
        checkWin(board[0][1], board[1][01], board[2][1]);
        checkWin(board[0][2], board[1][2], board[2][2]);
        checkWin(board[0][0], board[1][1], board[2][2]);
        checkWin(board[0][2], board[1][1], board[2][0]);

        fr.println(individual.size());
        fr.println(duo.size());
        fr.close();
    }
    static void checkWin(char a, char b, char c) {
        if (a == b && a == c) {
            individual.add(a);
        } else if (a == b || b == c || c == a) {
            duo.add(new HashSet<>(Arrays.asList(a, b, c)));
        }
    }
}
