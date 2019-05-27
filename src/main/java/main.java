public class main {

    public static void main(String[] args) {
        Player playerOne = new Player("PlayerOne");
        Player playerTwo = new Player("PlayerTwo");
        Game game = new Game(playerOne, playerTwo);
        game.playerOneScore();
        game.playerOneScore();
        game.playerTwoScore();
        game.playerTwoScore();
        game.playerTwoScore();
        System.out.println("the score is " +game.getTennisScore());
    }
}
