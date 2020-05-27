import java.awt.*;

public class Car {

    // Data Types;
    // int -> integer 1, 2, 3
    // double -> decimal 34.5, 32.1

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTaillightsWorking;

    public Car(double inputAverageMPG, String inputLicensePlate,
               Color inputPaintColor, boolean inputAreTaillightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.areTaillightsWorking = inputAreTaillightsWorking;
        this.paintColor = inputPaintColor;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed) {
        currentSpeed += 100;
        return currentSpeed;
    }

}
