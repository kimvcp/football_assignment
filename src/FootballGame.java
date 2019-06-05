import java.util.ArrayList;
import java.util.List;
/**
 * A class representing a football game, containing fans of team A and team B.
 */

public class FootballGame {
    private List<FootballFans> fansA;
    private List<FootballFans> fansB;

    public FootballGame() {
        this.fansA = new ArrayList<>();
        this.fansB = new ArrayList<>();
    }

    /**
     * Add fans for a specific football team.
     * @param number of fans to be added.
     * @param fans of football team.
     */
    public void addFans(int number, FootballFans fans) {
        if (fans instanceof FansA) {
            for (int i = 0; i < number; i++) {
                fansA.add(fans);
            }
        } else {
            for (int i = 0; i < number; i++) {
                fansB.add(fans);
            }
        }
    }

    /**
     * When team make goal, all of their fans will express.
     *
     * @param fans
     */
    public void goal(FootballFans fans) {
        if (fans instanceof FansA) {
            fansA.forEach(fanA -> fanA.express());
        } else if (fans instanceof FansB) {
            fansB.forEach(fanB -> fanB.express());
        }
    }
}
