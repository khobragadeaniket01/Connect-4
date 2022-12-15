package Main;

public class Main {
    public static void main(String[] args) {
        // Declare new object from class Input to call methods
        Input input = new Input();
        Game game = new Game();

        // Define players and reset scores
        input.setPlayerName(1);
        Player player1 = new Player(input.getPlayerName(1), "X", 21, 0);
        input.setPlayerName(2);
        Player player2 = new Player(input.getPlayerName(2), "O", 21, 0 );
        player2.setPlayerScore(0);

        game.createPlayerTab(player1, player2);

        do {
            // Player 1 turn
            game.printGameTab();
            do {
                input.playerTurnMessage(player1.getPlayerName());
                input.setColumnToPlay();
                input.setRowToPlay();
                game.setMove("valid");
                game.checkTab(input.getRowToPlay() - 1, input.getColumnToPlay() - 1);
            }while (game.move == "invalid");
            game.fillTab(player1.getPlayerTag(),input.getRowToPlay() - 1, input.getColumnToPlay() - 1);
            player1.setPlayerDiscNumber((player1.getPlayerDiscNumber() - 1));
            game.readTab(player1);
            if (game.win==1) {input.winMessage(player1.getPlayerName()); break;}

            // Player 2 turn
            game.printGameTab();
            do {
                input.playerTurnMessage(player2.getPlayerName());
                input.setColumnToPlay();
                input.setRowToPlay();
                game.setMove("valid");
                game.checkTab(input.getRowToPlay() - 1, input.getColumnToPlay() - 1);
            }while (game.move == "invalid");
            game.fillTab(player2.getPlayerTag(),input.getRowToPlay() - 1, input.getColumnToPlay() - 1);
            player2.setPlayerDiscNumber((player2.getPlayerDiscNumber() - 1));
            game.readTab(player2);
            if (game.win==1) {input.winMessage(player2.getPlayerName()); break;}

        } while(game.win == 0);
        game.printGameTab();

    }
}
