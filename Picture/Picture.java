
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Circle moon;
    private Square main;
    private Square left;
    private Square right;
    private Square ground;
    private Square sky;
    //private Triangle leftRoof;
    private Triangle roof;
    private Square window;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
        this.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.makeVisible();
        sky.changeSize(5000);
        sky.changeColor("blue");
        sky.moveHorizontal(-90);
        sky.moveVertical(-50);
        
        moon = new Circle();
        moon.makeVisible();
        moon.changeColor("yellow");
        moon.moveHorizontal(60);
        moon.changeSize(150);
        
        ground = new Square();
        ground.makeVisible();
        ground.changeColor("black");
        ground.changeSize(500);
        ground.moveHorizontal(-100);
        ground.moveVertical(160);
        
        main = new Square();
        main.makeVisible();
        main.changeColor("black");
        main.changeSize(100);
        main.moveVertical(65);
        main.moveHorizontal(40);
        
        //left = new Square();
        
        //right = new Square();
        
        //leftRoof = new Triangle();
        
        roof = new Triangle();
        roof.makeVisible();
        roof.changeSize(45,125);
        roof.changeColor("black");
        roof.moveVertical(55);
        roof.moveHorizontal(98);
        
        window = new Square();
        window.makeVisible();
        window.changeColor("yellow");
        window.moveHorizontal(95);
        window.moveVertical(80);
        
        
    }

    public void sunset() {
        //sun.slowMoveVertical(300);
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(main != null)   // only if it's painted already...
        {
            main.changeColor("black");
            left.changeColor("black");
            right.changeColor("black");
            //leftRoof.changeColor("black");
            roof.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(main != null)   // only if it's painted already...
        {
            main.changeColor("red");
            left.changeColor("black");
            right.changeColor("green");
            //leftRoof.changeColor("red");
            roof.changeColor("red");
            moon.changeColor("yellow");
        }
    }

}
