package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Toyota", "Camry", 2000);
        motorcycle = new Motorcycle("Progasi", "Enduro", 2005);
    }
    @Test
    @DisplayName("Машина является транспортом.")
    void CarIsVehicle(){
        assertInstanceOf(Vehicle.class, this.car);
    }
    @Test
    @DisplayName("У машины 4 колеса")
    void fourWheels(){
        assertEquals(this.car.getNumWheels(), 4);
    }
    @Test
    @DisplayName("У мотоцикла 2 колеса")
    void twoWheels(){
        assertEquals(this.motorcycle.getNumWheels(), 2);
    }
    @Test
    @DisplayName("Машина едет 60км")
    void CarTestDriveTest(){
        this.car.testDrive();
        assertEquals(this.car.getSpeed(), 60);
    }
    @Test
    @DisplayName("Мотоцикл едет 75км")
    void MotorcycleTestDriveTest(){
        this.motorcycle.testDrive();
        assertEquals(this.motorcycle.getSpeed(), 75);
    }
    @Test
    @DisplayName("Машина останавливается при парковке")
    void CarParkTest(){
        this.car.testDrive();
        this.car.park();
        assertEquals(this.car.getSpeed(), 0);
    }
    @Test
    @DisplayName("Мотоцикл останавливается при парковке")
    void MotorcycleParkTest(){
        this.motorcycle.testDrive();
        this.motorcycle.park();
        assertEquals(this.motorcycle.getSpeed(), 0);
    }
}
/*
 *              - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
 *              - проверка того, объект Car создается с 4-мя колесами
 *              - проверка того, объект Motorcycle создается с 2-мя колесами
 *              - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
 *              - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
 *              - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
 *              - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
 */