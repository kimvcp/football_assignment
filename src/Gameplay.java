/**
 * Main class representing gameplay.
 */
public class Gameplay {
    public static void main(String[] args) {
        FootballGame game = new FootballGame();
        FootballFans fansA = new FansA();
        FootballFans fansB = new FansB();
        game.addFans(2, fansA);
        game.addFans(3 , fansB);
        game.goal(fansA);
        game.goal(fansB);

    }
}
