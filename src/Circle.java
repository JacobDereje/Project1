public class Circle {
public double x_position;
public double y_position;
public double height;
public String Color;
public double pos;
public double radius;

public Circle(double x_position, double y_position, double height){
    this.x_position = x_position;
    this.y_position = y_position;
    this.height = height;
}
public void perimeter(){
    double perimeter = 2 * Math.PI * radius;


}
public void area(){
    double area = (radius * radius) * Math.PI;


}
public void setColor(String Color){
    this.Color = Color;


}
public void setPos(double x_position, double y_position){
    this.pos = pos;
}

public setRadius(double radius) {
    this.radius = radius;
}
public String getColor(String Color){
    return Color;

}

public double getXPos(double x_position) {
    return x_position;


}

public double getYPos (double y_position) {
    return y_position;

}
public double getRadius (double Radius){
    return radius;

}




    }

