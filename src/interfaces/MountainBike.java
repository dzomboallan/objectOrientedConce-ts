/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author hunnytaggy
 */
class MountainBike implements Bicycle {
    private int seatHeight;
    private int gear;
    private int speed;
    
    public MountainBike(int startHeight, int startSpeed, int startGear){
        seatHeight = startHeight;
        speed = startSpeed;
        gear = startGear;
    }
    
    public int getSeatHeight(){
        return this.seatHeight;
    }

    public int getGear(){
        return this.gear;
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void setSeatHeight(int height){
        this.seatHeight = height;
    }
    
    public void setGear(int startGear){
        this.gear = startGear;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    @Override
    public void applyBrakes(int decrement){
        speed = speed-decrement;
    }
    
    @Override
    public void speedUp(int increment){
        speed = speed+increment;
    }
}
