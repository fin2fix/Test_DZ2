package Vehicle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("Honda", "CB1000R", 2023);
    }

    @AfterEach
    void tearDown() {
        motorcycle = null;
    }

    @Test
    @DisplayName("Экземпляр объекта Motorcycle также является экземпляром Vehicle")
    void isMotorcycleInstanceVehicleClass() {
        assertTrue(motorcycle instanceof Vehicle);
    }

    @Test
    @DisplayName("У мотоцикла 2 колеса (при создании экземпляра объекта)")
    void numberOfWheelsOfCar() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    @DisplayName("В режиме testDrive скорость = 75")
    void speedInTestDriveMode() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    @DisplayName("В режиме парковки мотоцикл останавливается")
    void speedInParkMode() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}