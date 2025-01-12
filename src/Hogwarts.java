package org.example.classes;

import java.util.Objects;

public class Hogwarts {

    protected final String flrstName;

    protected final String lastName;

    protected int powerofMagic;

    protected int distanceOfTransgression;

    public Hogwarts(String flrstName, String lastName, int powerofMagic, int distanceOfTransgression) {
        this.flrstName = flrstName;
        this.lastName = lastName;
        this.powerofMagic = powerofMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getFlrstName() {
        return flrstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPomerofMagic() {
        return powerofMagic;
    }

    public void setPomerofMagic(int pomerofMagic) {
        this.powerofMagic = pomerofMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "flrstName='" + flrstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pomerofMagic=" + powerofMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return powerofMagic == hogwarts.powerofMagic && distanceOfTransgression == hogwarts.distanceOfTransgression && Objects.equals(flrstName, hogwarts.flrstName) && Objects.equals(lastName, hogwarts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flrstName, lastName, powerofMagic, distanceOfTransgression);
    }

    private int getTotalPoints() { return powerofMagic + distanceOfTransgression; }

    public static void comparingStudents (Hogwarts studentOne, Hogwarts studentTwo) {
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
