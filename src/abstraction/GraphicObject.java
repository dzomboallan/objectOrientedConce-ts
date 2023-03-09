/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

/**
 *
 * @author hunnytaggy
 */
public abstract class GraphicObject {
    int x, y;
    
    void moveTo(int newX, int newY){
        System.out.println("move to x: "+x+" and y:"+y);
    }
    
    abstract void draw();
    abstract void resize();
}
