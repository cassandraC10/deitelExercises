//package Tdd;
//
//import org.testng.annotations.Test;
//
//import static org.testng.AssertJUnit.assertNotNull;
//
//public class BikeTest {
//    @Test
//    public void bikeCanBeCreated() {
//        Bike sandraBike = new Bike();
//        assertNotNull(sandraBike);
//    }
//
//    @Test
//    public void isOn() {
//        Bike sandraBike = new Bike();
//        sandraBike.setSwitch();
//        assertEquals(true, sandraBike.isOn());
//    }
//
//    @Test
//    public void bikeAccelerationUp() {
//        Bike sandraBike = new Bike();
//        sandraBike.setSwitch();
//        sandraBike.accelerate();
//        assertEquals(1, sandraBike.getspeed());
//    }
//
//    @Test
//    public void bikeAcceleration() {
//        Bike sandraBike = new Bike();
//        sandraBike.setSwitch();
//        sandraBike.accelerate();
//        sandraBike.Gear();
//        assertEquals(1, sandraBike.getGear());
//    }
//
//    @Test
//    public void bikeCanSpeed() {
//        Bike sandraBike = new Bike();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//
//        assertEquals(16, sandraBike.getspeed());
//    }
//
//    @Test
//    public void bikeCanSpeedUpTo22() {
//        Bike sandraBike = new Bike();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//        sandraBike.accelerate();
//
//        assertEquals(22, sandraBike.getspeed());
//    }
//
//    @Test
//    public void bikeCanSpeedUpTo33() {
//        Bike cE = new Bike();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        assertEquals(33, cE.getspeed());
//    }
//
//    @Test
//    public void bikeCanSpeedUp() {
//        Bike cE = new Bike();
//        cE.getGear();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        cE.accelerate();
//        assertEquals(15, cE.getspeed());
//    }
//}
