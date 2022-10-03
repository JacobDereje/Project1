//Po Cheng Cheng(Brandon Cheng), chen7381
//Jacob Dereje, derej006

import java.awt.Color;
public class Circle {
    private double x_position, y_position, radius;
    private Color color;


    public Circle(double x_position, double y_position, double radius){
        this.x_position = x_position;
        this.y_position = y_position;
        this.radius = radius;
    }
    public double calculatePerimeter(){
        return (2 * Math.PI * this.radius);
    }
    public double calculateArea(){
        return (this.radius * this.radius * Math.PI);
    }
    public void setColor(Color newColor){
        this.color = newColor;
    }
    public Color getColor(){
        return this.color;
    }
    public void setPos(double x_position, double y_position){
        this.x_position = x_position;
        this.y_position = y_position;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getXPos(){
        return x_position;
    }

    public double getYPos(){
        return y_position;
    }
    public double getRadius(){
        return radius;
    }




}

