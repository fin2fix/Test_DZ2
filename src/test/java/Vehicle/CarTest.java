package Vehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Honda", "C-RV", 2023);
    }

    @AfterEach
    void tearDown() {
        car = null;
    }

    @Test
    @DisplayName("Экземпляр объекта Car также является экземпляром Vehicle")
    void isCarInstanceVehicleClass() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("У машины 4 колеса (при создании экземпляра объекта)")
    void numberOfWheelsOfCar() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    @DisplayName("В режиме testDrive скорость = 60")
    void speedInTestDriveMode() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    @DisplayName("В режиме парковки машина останавливается")
    void speedInParkMode() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }


}