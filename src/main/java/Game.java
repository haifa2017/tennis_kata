class Game {
    private Player playerOne;
    private Player playerTwo;

    Game(Player player1, Player player2) {
        this.playerOne = player1;
        this.playerTwo = player2;
    }

    int getPlayerOneCurrentScore(){
        return playerOne.getCurrentScore();
    }

    int getPlayerTwoCurrentScore(){
        return playerTwo.getCurrentScore();
    }
}
