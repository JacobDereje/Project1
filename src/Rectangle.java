//Po Cheng Cheng(Brandon Cheng), chen7381
import java.awt.Color;

public class Rectangle{
    private double xPos, yPos, height, width;
    private Color color;

    public Rectangle(double xPosUpperLeft, double yPosUpperLeft, double height, double width){
        this.xPos = xPosUpperLeft;
        this.yPos = yPosUpperLeft;
        this.height = height;
        this.width = width;
    }
    public double calculatePerimeter(){
        return 2*(height+width);
    }
    public double calculateArea(){
        return (this.width * this.height);
    }

    public void setColor(Color newColor){
        this.color = newColor;
    }
    public Color getColor(){
        return this.color;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getXPos(){
        return this.xPos;
    }
    public double getYPos(){
        return this.yPos;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

}
