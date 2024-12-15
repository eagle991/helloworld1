package org.example.classes;

public class Hufflepuff extends org.example.classes.Hogwarts {

    private int smart;

    private int wisdom;

    private int wit;

    private int creativity;

    public Hufflepuff(String firstName, String lastName, int powerMagic, int smart, int wisdom, int creativity) {
        super(firstName, lastName, powerMagic, distanceOfTransgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                "flrstName='" + flrstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pomerofMagic=" + powerofMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    private int getTotalPoints() {
        return smart + wisdom + wit + creativity;
    }


    public static void comparingStudents (Hufflepuff studentOne, Hufflepuff studentTwo) {
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
