/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author hunnytaggy
 */
public class MountainBike extends Bicycle {
    public int seatHeight;
    
    public MountainBike(int startHeight, int startSpeed, int startGear){
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }
    
    public void setHeight(int newValue){
        seatHeight = newValue;
    } 
    
    public int getSeatHeight(){
        return this.seatHeight;
    }
}
