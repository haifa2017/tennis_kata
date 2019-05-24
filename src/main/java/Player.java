import java.util.Arrays;
import java.util.List;

public class Player {
    private static final List<Integer> scores = Arrays.asList(0, 15, 30, 40);

    private String name;

    private int currentScore;

    Player(String name) {
        this.name = name;
        this.currentScore = 0;
    }

    int getCurrentScore() {
        return currentScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
}
