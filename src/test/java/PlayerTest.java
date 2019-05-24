import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;


public class PlayerTest {
    private Player player;

    @Before
    public void setup() {
        player = new Player("Player One");
    }

    @Test
    public void player_should_start_with_score_of_0(){
        Assertions.assertThat(player.getCurrentScore()).isEqualTo(0);
    }
}
