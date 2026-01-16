package src.Car;

import java.math.BigDecimal;

public class CarDao {
    private final Car[] bookedCars = new Car[2];
    private final static Car[] AVAILABLE_CARS = new Car[8];

    public CarDao() {
        availableCars();
    }

    public void addCar(Car car) {
       for(int i = 0; i < bookedCars.length; i++) {
           if(bookedCars[i] == null) {
               bookedCars[i] = car;
               break;
           }
       }
    }

    public void removeCar(Car car) {
        for(int i = 0; i < bookedCars.length; i++) {
            if(bookedCars[i] != null && bookedCars[i] == car) {
                bookedCars[i] = null;
                break;
            }
        }
    }

    public static Car[] availableCars() {
        AVAILABLE_CARS[0] = new Car( "BMW", "430i", "Blue", 2001, new BigDecimal("74.99"), CarTransmission.FUEL, true);
        AVAILABLE_CARS[1] = new Car( "BMW", "330i", "Red", 2001, new BigDecimal("80.99"), CarTransmission.FUEL, true );
        AVAILABLE_CARS[2] = new Car( "Toyota", "Camry", "White", 2012, new BigDecimal("50.99"), CarTransmission.ELECTRIC, true );
        AVAILABLE_CARS[3] = new Car("Toyota", "CRV", "Green", 2014, new BigDecimal("65.99"), CarTransmission.FUEL, true );
        AVAILABLE_CARS[4] = new Car( "Toyota", "Tundra", "Blue", 2010, new BigDecimal("55.99"), CarTransmission.ELECTRIC, true );
        AVAILABLE_CARS[5] = new Car( "Jaguar", "XF", "Yellow", 2020, new BigDecimal("100.99"), CarTransmission.ELECTRIC, true );
        AVAILABLE_CARS[6] = new Car( "Honda", "Civic", "Grey", 2011, new BigDecimal("45.99"), CarTransmission.FUEL, true );
        AVAILABLE_CARS[7] = new Car( "Dodge", "Ram", "Blue", 2011, new BigDecimal("150.99"), CarTransmission.ELECTRIC, true );
      return AVAILABLE_CARS;
    }
}
