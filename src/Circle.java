public class Circle {
    public double x_position, y_position, radius;
    public String color;


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
    public void setColor(String Color){
        this.color = Color;


    }
    public void setPos(double x_position, double y_position){
        this.x_position = x_position;
        this.y_position = y_position;
    }

    public double setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return this.color;

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

