import java.awt.Color;
public class Triangle{
    public double xPos, yPos, width, height, side;

    public Triangle(double xPosBottomLeft, double yPosBottomLeft, double width, double height){
        this.xPos = xPosBottomLeft;
        this.yPos = yPosBottomLeft;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter(){
        side = Math.sqrt((this.width/2)*(this.width/2)+(height*height));
        return (side*2+this.width);
    }
    public double calculateArea(){
        return (this.width * this.height / 2);
    }

    public void setPos(double xPos, double yPos){
        this.xPos = xPos;
        this.yPos = yPos;
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
    public double getHeight(){
        return this.height;
    }
    public double getWidths(){
        return this.width;
    }

}
