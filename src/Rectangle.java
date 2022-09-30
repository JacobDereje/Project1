import javafx.beans.binding.DoubleExpression;

public class Rectangle {
public double x_position;
public double y_position;
public double height;
public String Color;
public double Pos;
public double Width;

public Perimeter(){
    double perimeter;
    perimeter = 2 * setHeight();
}

public void setColor(String color){
    this.Color = Color;
}
public void setPos(Double Pos){
    this.Pos = Pos;
}
public void setHeight(double height){
    this.height = height;
}
public void setWidth(double Width){
    this.Width = Width;
}

}
