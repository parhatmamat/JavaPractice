import java.util.Random;

public class Dice {
    int faceSide;
    int prevRoll = -1;

    public Dice() {
        roll();
    }

    public void roll() {
        Random rand = new Random();
        faceSide = rand.nextInt(6) + 1;
        prevRoll = faceSide;
    }
}
