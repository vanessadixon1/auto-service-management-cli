package src.Car;

import java.util.UUID;

public class CarServices {
    private final CarDao carDao;

    public CarServices(CarDao carDao) {
        this.carDao = carDao;
    }

    public void addCar(UUID id) {
        Car[] cars = CarDao.availableCars();
        for (Car c : cars) {
            if(c.getUuid().equals(id) ) {
                if(c.isAvailable()) {
                    carDao.addCar(c);
                    c.setAvailable(false);
                } else {
                    System.out.println("Car already booked");
                }
                return;
            }
        }
        System.out.printf("Car id %s doesn't exist%n", id);
    }

    public void removeCar(UUID id) {
        Car[] cars = CarDao.availableCars();
        for(Car c : cars) {
            if(c.getUuid().equals(id)) {
                if(c.isAvailable()) {
                    carDao.removeCar(c);
                    c.setAvailable(true);
                    System.out.printf("Care id %s removed%n", id);
                    return;
                }
            }
        }
        System.out.printf("Car id %s doesn't exist%n", id);
    }

}
