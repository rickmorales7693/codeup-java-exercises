package lectures.objectorientedprogramming;

import java.util.Scanner;

public class Bicycle {
    // Static Properties
    final public static int NUM_OF_WHEELS = 2;
    protected static int bikesCreated = 0;

    // Instance Properties
    private String color;
    private int totalGears;
    private int currentGear;

    // Constructors
    public Bicycle() {
        this.color = "white";
        bikesCreated++;
    }
    public Bicycle(int totalGears, int currentGear) {
        this.totalGears = totalGears;
        this.currentGear = currentGear;
        bikesCreated++;
    }
    public Bicycle(String color, int totalGears, int currentGear) {
        this.color = color;
        this.totalGears = totalGears;
        this.currentGear = currentGear;
        bikesCreated++;
    }

    // Getters and Setters
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getTotalGears() {
        return totalGears;
    }
    public void setTotalGears(int totalGears) {
        this.totalGears = totalGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }
    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    // Instance Methods
    public void repaint(String color) {
        System.out.println("Repainting the bike to " + color);
        this.color = color;
    }
    public void repaint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What color would you like your bike to be?");
        this.repaint(scanner.nextLine());
        scanner.close();
    }
    public void gearUp() {
        if(currentGear == totalGears) {
            System.out.println("Already at the highest gear.");
            return;
        }
        currentGear++;
        System.out.printf("Shifted up to gear %d%n", currentGear);
    }
    public void gearDown() {
        if(currentGear == 1) {
            System.out.println("Already at the lowest gear");
            return;
        }
        currentGear--;
        System.out.printf("Shifted down to gear %d%n", currentGear);
    }
    public void changeGear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What gear would you like to change to?");
        int gear = scanner.nextInt();
        this.currentGear = gear;
        scanner.close();
    }
}
