package Main;

import java.util.*;

public class Game {
    String[][] gameTab = new String[6][7];
    Player[] playerTab = new Player[2];
    String line="", move="valid";
    int win=0;

    public void createPlayerTab(Player player1, Player player2) {
        playerTab[0] = player1;
        playerTab[1] = player2;
        for (int i=0;i<=5;i++){
            for (int j=0; j<=6;j++)
                gameTab[i][j]="-";
        }
    }

    public void checkTab(int rowToPlay, int columnToPlay) {
        try {
            if (gameTab[rowToPlay + 1][columnToPlay] == "-") {
                move = "invalid";
                System.out.println("Invalid move");
            }
        } catch (Exception e) {
            System.out.print("");
        } finally {
        }
    }

    public void fillTab(String playerTag, int rowToPlay, int columnToPlay){
        gameTab[rowToPlay][columnToPlay] = playerTag;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int readTab (Player player){ //check rows, columns and diagonals for a line of four

        // Check rows
        line="";
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 5; j++) {
                line += gameTab[j][i];
            }
            if (line.contains("XXXX") || line.contains("OOOO")) win=1;
        }

        // Check columns
        line="";
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                line += gameTab[i][j];
            }
            if (line.contains("XXXX") || line.contains("OOOO")) win=1;
        }

        // Check diagonals from upper left to bottom right
        line="";
        line=gameTab[2][0] + gameTab[3][1] + gameTab[4][2] + gameTab[5][3];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        line="";
        line=gameTab[1][0] + gameTab[2][1] + gameTab[3][2] + gameTab[4][3] + gameTab[5][4];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        line="";
        line=gameTab[0][0] + gameTab[1][1] + gameTab[2][2] + gameTab[3][3] + gameTab[4][4] + gameTab[5][5];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        line="";
        line=gameTab[0][1] + gameTab[1][2] + gameTab[2][3] + gameTab[3][4] + gameTab[4][5] + gameTab[5][6];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        line="";
        line=gameTab[0][2] + gameTab[1][3] + gameTab[2][4] + gameTab[3][5] + gameTab[4][6];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        line="";
        line=gameTab[0][3] + gameTab[2][1] + gameTab[1][2] + gameTab[0][3];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        // Check diagonals from upper right to bottom left
        line="";
        line=gameTab[4][0] + gameTab[3][1] + gameTab[2][2] + gameTab[1][3] + gameTab[0][4];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        line="";
        line=gameTab[5][0] + gameTab[4][1] + gameTab[3][2] + gameTab[2][3] + gameTab[1][4] + gameTab[0][5];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        line="";
        line=gameTab[5][1] + gameTab[4][2] + gameTab[3][3] + gameTab[2][4] + gameTab[1][5] + gameTab[0][6];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        line="";
        line=gameTab[5][2] + gameTab[4][3] + gameTab[3][4] + gameTab[2][5] + gameTab[1][6];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        line="";
        line=gameTab[5][3] + gameTab[4][4] + gameTab[3][5] + gameTab[2][6];
        if (line.contains("XXXX") || line.contains("OOOO")) win=1;

        return win;
    }

    public void printGameTab(){
        System.out.print("\n     ");
            for (int i = 1; i <= 7; i++) {
                System.out.print(i + "   ");
            }
            System.out.print("\n 1 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[0][i] + " | ");
            }
            System.out.print("\n 2 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[1][i] + " | ");
            }
            System.out.print("\n 3 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[2][i] + " | ");
            }
            System.out.print("\n 4 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[3][i] + " | ");
            }
            System.out.print("\n 5 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[4][i] + " | ");
            }
            System.out.print("\n 6 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[5][i] + " | ");
            }
            System.out.print("\n");
        }
}
