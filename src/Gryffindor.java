package org.example.classes;

public class Gryffindor extends Hogwarts {

    private int nobility;

    private int honor;

    private int bravery;

    public Gryfflndor (String firstName, String lastName, int powerMagic, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "flrstName='" + flrstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pomerofMagic=" + powerofMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    private int getTotalPoints() {
        return nobility + honor + bravery; }


    public static void comparingStudents (Gryffindor studentOne, Gryffindor studentTwo) {
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
