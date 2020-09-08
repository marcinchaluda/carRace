package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {
    protected String name;
    protected int normalSpeed;
    protected int actualSpeed;
    protected int distanceTravelled;

    public abstract void prepareForLap(Race race);

    public final void moveForAnHour() {
        distanceTravelled +=actualSpeed;
    }

    public Vehicle(int normalSpeed) {
        this.name = generateName();
        this.normalSpeed = this.normalSpeed;
    }

    protected abstract String generateName();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{")
                .append("distance travelled: ")
                .append(distanceTravelled)
                .append(", ")
                .append("type: ")
                .append(getClass().getSimpleName())
                .append(", ")
                .append("name: ")
                .append(name)
                .append("}");
        return builder.toString();
    }
}
