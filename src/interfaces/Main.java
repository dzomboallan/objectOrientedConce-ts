/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author hunnytaggy
 */
public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20,10,1);
        
        System.out.println("Gear is: "+mountainBike.getGear());
        System.out.println("Seat height is: "+mountainBike.getSeatHeight());
        System.out.println("Bike speed is: "+mountainBike.getSpeed());
        
        mountainBike.applyBrakes(1);
        System.out.println("Bike speed after applying break is: "+mountainBike.getSpeed());
        
        mountainBike.speedUp(10);
        System.out.println("Bike's new speed after increament is: "+mountainBike.getSpeed());
    }
}
