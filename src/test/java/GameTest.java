import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class GameTest {


    private Game game;

    @Before
    public void setup() {
        Player playerOne = new Player("PlayerOne");
        Player playerTwo = new Player("PlayerTwo");
        game = new Game(playerOne, playerTwo);
    }

    @Test
    public void game_should_start_with_score_of_0_0(){
        Assertions.assertThat(game.getPlayerOneCurrentScore()).isEqualTo(0);
        Assertions.assertThat(game.getPlayerTwoCurrentScore()).isEqualTo(0);
    }

    @Test
    public void game_should_start_with_score_of_0_15(){
        game.playerTwoScore();
        Assertions.assertThat(game.getTennisScore()).isEqualTo("0-15");
    }

    @Test
    public void game_should_start_with_score_of_15_0(){
        game.playerOneScore();
        Assertions.assertThat(game.getTennisScore()).isEqualTo("15-0");
    }

    @Test
    public void game_should_have_tennis_score_15_15(){
        game.playerOneScore();
        game.playerTwoScore();
        Assertions.assertThat(game.getTennisScore()).isEqualTo("15-15");
    }

    @Test
    public void game_should_have_tennis_score_15_30(){
        game.playerOneScore();
        game.playerTwoScore();
        game.playerTwoScore();
        Assertions.assertThat(game.getTennisScore()).isEqualTo("15-30");
    }
    @Test
    public void game_should_have_tennis_score_30_40(){
        game.playerOneScore();
        game.playerOneScore();
        game.playerTwoScore();
        game.playerTwoScore();
        game.playerTwoScore();
        Assertions.assertThat(game.getTennisScore()).isEqualTo("30-40");
    }

    @Test
    public void game_should_have_tennis_score_40_40(){
        game.playerOneScore();
        game.playerOneScore();
        game.playerOneScore();
        game.playerTwoScore();
        game.playerTwoScore();
        game.playerTwoScore();
        Assertions.assertThat(game.getTennisScore()).isEqualTo("40-40");
    }
    @Test
    public void game_should_have_tennis_score_deuce(){
        game.playerOneScore();
        game.playerOneScore();
        game.playerOneScore();
        game.playerOneScore();
        game.playerTwoScore();
        game.playerTwoScore();
        game.playerTwoScore();
        game.playerTwoScore();
        Assertions.assertThat(game.getTennisScore()).isEqualTo("Deuce");
    }

    @Test
    public void game_should_have_tennis_score_playerOne_Win(){
        game.playerOneScore();
        game.playerOneScore();
        game.playerOneScore();
        game.playerOneScore();
        Assertions.assertThat(game.getTennisScore()).isEqualTo("PlayerOne Win");
    }
}
