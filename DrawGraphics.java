/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 * //Creo los arreglos y objetos
 * @author ERIKA
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.SplashScreen;
import java.util.ArrayList;

public class DrawGraphics {

    /** Initializes this class for drawing. */
    ArrayList<Bouncer> fuera = new ArrayList<>();
    ArrayList<StraightMover> rectangulo = new ArrayList<>();
    
    
    public DrawGraphics() {
              
        
                
        
        fuera.add(new Bouncer(70, 3,new Figuranueva(15, 65, Color.RED)));
        fuera.get(0).setMovementVector(2, 1);
        
        fuera.add(new Bouncer(90, 3,new Rectangle(80, 60, Color.BLUE) ));
        fuera.get(1).setMovementVector(3, 1);
               
        rectangulo.add(new StraightMover(10, 3,new Rectangle(70, 30, Color.yellow)));
        rectangulo.get(0).setMovementVector(3, 1);          
        
        rectangulo.add(new StraightMover(50, 7,new Figuranueva(43, 35, Color.BLACK)));
        rectangulo.get(1).setMovementVector(3, 1);
        
       // movingSprite.get(0).setMovementVector(30,40);
//        Rectangle box1 = new Rectangle(30, 50, Color.GRAY);
//        movingSprite.add(new Bouncer(100, 170, box));
//        movingSprite.get(0).setMovementVector(3, 1);  //Velocidad
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface){
        for(Bouncer bo:fuera){
        bo.draw(surface);
        }
       for(StraightMover bo:rectangulo){
        bo.draw(surface);
        }
    }
}
