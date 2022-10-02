import java.awt.Color;

public class Rectangle {
    public double x_position, y_position, height, width;
    Color color = new Color();

    public Rectangle(double xPosUpperLeft, double yPosUpperLeft, double height, double width){
        this.x_position = xPosUpperLeft;
        this.y_position = yPosUpperLeft;
        this.height = height;
        this.width = width;
        this.color = color;
    }
    public double calculatePerimeter(){
        return 2*(height+width);
    }
    public double calculateArea(){
        return this.width * this.height;
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
        return this.x_position;
    }
    public double getYPos(){
        return this.y_position;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

}
