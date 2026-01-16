package com.amcsoftware.Car;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Car {
    private UUID uuid;
    private String make;
    private String model;
    private String color;
    private int year;
    private BigDecimal price;
    private CarTransmission carTransmission;
    private boolean isAvailable;
    private static int randomNum = 0;

    public Car(String make, String model, String color, int year, BigDecimal price, CarTransmission carTransmission, boolean isAvailable) {
        this.uuid = UUID.fromString("11111111-1111-1111-1111-1111111111%s".formatted(randomNum++));
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.carTransmission = carTransmission;
        this.isAvailable = isAvailable;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CarTransmission getCarTransmission() {
        return carTransmission;
    }

    public void setCarTransmission(CarTransmission carTransmission) {
        this.carTransmission = carTransmission;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && isAvailable == car.isAvailable && Objects.equals(uuid, car.uuid) && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(price, car.price) && carTransmission == car.carTransmission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, make, model, color, year, price, carTransmission, isAvailable);
    }

    @Override
    public String toString() {
        return "Car{" +
                "uuid=" + uuid +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", carTransmission=" + carTransmission +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
