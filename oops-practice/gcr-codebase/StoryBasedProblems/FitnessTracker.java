interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }

    static void trackerInfo() {
        System.out.println("Fitness Tracker System");
    }
}

interface Reportable {

    void generateReport();
}

interface Notifiable {

    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    private String userName;
    private int steps;
    private int calories;

    FitnessDevice(String userName, int steps, int calories) {
        this.userName = userName;
        this.steps = steps;
        this.calories = calories;
    }

    @Override
    public void logActivity() {
        System.out.println("Activity Logged");
        System.out.println("User : " + userName);
        System.out.println("Steps : " + steps);
        System.out.println("Calories : " + calories);
    }

    @Override
    public void generateReport() {
        System.out.println("\nFitness Report");
        System.out.println("User : " + userName);
        System.out.println("Total Steps : " + steps);
        System.out.println("Calories Burned : " + calories);
    }

    @Override
    public void sendAlert() {
        if (steps < 5000) {
            System.out.println("Alert: Walk more today!");
        } else {
            System.out.println("Great Job! Daily Goal Achieved.");
        }
    }
}

public class FitnessTracker {

    public static void main(String[] args) {

        Trackable.trackerInfo();

        FitnessDevice device = new FitnessDevice(
                "Rahul",
                4200,
                320);

        device.logActivity();

        device.generateReport();

        device.sendAlert();

        device.resetData();
    }
}