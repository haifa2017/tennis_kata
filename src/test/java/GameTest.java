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
    public void game_should_have_tennis_score_15_15(){
        game.playerOneScore();
        game.playerTwoScore();
        Assertions.assertThat(game.getTennisScore()).isEqualTo("15-15");
    }

}
