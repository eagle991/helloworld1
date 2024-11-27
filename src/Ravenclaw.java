package org.example.classes;

public class Ravenclaw extends Hogwarts {

    private int diligence;

    private int loyalty;|

    private int honesty;

    public Ravenclaw(String firstName, String lastName, int powerMagic, int diligence, int loyalty, int honesty) {
        super(firstName, lastName, powerMagic, distanceOfTransgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", flrstName='" + flrstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerofMagic=" + powerofMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    private int getTotalPoints() {
        return diligence + loyalty + honesty; }


    public static void comparingStudents (Ravenclaw studentOne, Ravenclaw studentTwo) {
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