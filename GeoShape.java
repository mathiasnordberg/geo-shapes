
import java.awt.Graphics;

public abstract class GeoShape {

    protected int posX, posY;
    protected double area;
    
    public GeoShape(){
	posX = 0;
	posY = 0;
	area = calcArea();
    }
    

    public abstract double calcArea();
    
    public abstract void drawShape( Graphics g );
    
    public void setPos(int x, int y){
	posX = x;
	posY = y;
    }
}
