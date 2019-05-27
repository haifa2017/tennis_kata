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

    void playerOneScore() {
        this.playerOne.score();
    }

    void playerTwoScore() {
        this.playerTwo.score();
    }

    String getTennisScore(){
        if(playerOne.getCurrentScore()>3 && playerTwo.getCurrentScore()>3){
            if(playerOne.getCurrentScore() == playerTwo.getCurrentScore()){
                return "Deuce";
            }
        }
        if(playerOne.getCurrentScore()>3){
            return playerOne.getName()+" Win";
        }
        return playerOne.tennisScore()+"-"+playerTwo.tennisScore();
    }
}
