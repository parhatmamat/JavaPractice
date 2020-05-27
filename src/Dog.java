import java.awt.*;

public class Dog {

    String name;
    Color color;
    int age;
    String mood;
    String[] fetchedItm = {"Bone", "Stick", "Ball"};
    private int fetch_counter = 0;

    public Dog(String inputName, Color inputColor, int inputAge) {
        this.name = inputName;
        this.color = inputColor;
        this.age = inputAge;
    }

    public void bark() {
        System.out.println("Bark!");
    }

    public String patDog() {
        System.out.println("Dog is patted.");
        mood = "Happy";
        return mood;
    }

    public Color paintDog(Color inputColor) {
        this.color = inputColor;
        return inputColor;
    }

    public String toString() {
        return this.name + ", " + this.color.toString() + "," + this.age;
    }

    public void fetch() {

        String item = this.fetchedItm[fetch_counter];
        System.out.println(this.name + " fetched a " + item);
        fetch_counter = (fetch_counter + 1) % 3;
    }


}
