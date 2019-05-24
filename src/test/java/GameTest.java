import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class GameTest {


    private Player playerOne;
    private Player playerTwo;
    private Game game;

    @Before
    public void setup() {
        playerOne = new Player("PlayerOne");
        playerTwo = new Player("PlayerTwo");
        game = new Game(playerOne,playerTwo);
    }

    @Test
    public void game_should_start_with_score_of_0_0(){
        Assertions.assertThat(game.getPlayerOneCurrentScore()).isEqualTo(0);
        Assertions.assertThat(game.getPlayerTwoCurrentScore()).isEqualTo(0);
    }
}
