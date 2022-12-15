package Main;

import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);
    private String player;
    private int x, rowToPlay, columnToPlay;

    public void setPlayerName(int x) {
        System.out.print("\tEnter player " + x + " name : ");
        this.player = input.nextLine();
    }

    public String getPlayerName(int x) {
        return player;
    }

    public void setRowToPlay() { //Ask for a number of columns
        System.out.print("Choose the row to play (from 1 to 6) : ");
        this.rowToPlay = Integer.parseInt(input.nextLine());

    }

    public void setColumnToPlay() { //Ask for a number of columns
        System.out.print("Choose the column to play (from 1 to 7) : ");
        this.columnToPlay = Integer.parseInt(input.nextLine());

    }

    public void playerTurnMessage(String playerName){
        System.out.print("\n* " + playerName + " it's your turn *\n");
    }

    public int getRowToPlay() {
        return rowToPlay = rowToPlay;
    }

    public int getColumnToPlay() {
        return columnToPlay = columnToPlay;
    }

    public void winMessage(String playername) {
        System.out.println(playername.toUpperCase() + " HAS WON !");
    }
}