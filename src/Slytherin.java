package org.example.classes;

public class Slytherin extends Hogwarts {

    private int trick;

    private int determination;|

    private int resourcefulness;
    private int ambition;
    private int thirstOfPower;

    public Slytherin(String firstName, String lastName, int powerMagic, int trick, int determination, int resourcefulness, int ambition, int thirstOfPower) {
        super(firstName, lastName, powerMagic, distanceOfTransgression);
        this.trick = trick;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.ambition = ambition;
        this.thirstOfPower = thirstOfPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getThirstOfPower() {
        return thirstOfPower;
    }

    public void setThirstOfPower(int thirstOfPower) {
        this.thirstOfPower = thirstOfPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "trick=" + trick +
                ", determination=" + determination +
                ", resourcefulness=" + resourcefulness +
                ", ambition=" + ambition +
                ", thirstOfPower=" + thirstOfPower +
                ", flrstName='" + flrstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerofMagic=" + powerofMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    private int getTotalPoints() {
        return trick + determination + resourcefulness + ambition + thirstOfPower ; }


    public static void comparingStudents (Slytherin studentOne, Slytherin studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " обладает большей моцностью магии, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " обладает большей мощностью магии, чем " + studentOne);
        }
        else {
            System.out.println("Студенты по силе равны");
        }
    }
}