/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;
//llama a lo metodos 
/**
 *
 * @author ERIKA
 */
import java.awt.Graphics;

public interface Sprite {
    /**
     * Draws this sprite on surface, with the coordinate (leftX, topY) as the
     * top left corner.
     */
    void draw(Graphics surface, int leftX, int topY);

    /** Returns the width of the sprite. */
    int getWidth();

    /** Returns the height of the sprite. */
    int getHeight();
}
