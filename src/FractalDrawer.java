//Po Cheng Cheng(Brandon Cheng), chen7381
// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // contructor

    public double drawFractal(String type) {
        Canvas myCanvas = new Canvas(800,1000);
        if (type.equals("circle")){
            drawCircleFractal(100,400,500,Color.BLUE, myCanvas, 0);
        }
        else if (type.equals("triangle")){
            drawTriangleFractal(200,200,300,400,Color.BLUE, myCanvas,0);
        }
        else if (type.equals("rectangle")){
            drawRectangleFractal(100,100,300,300,Color.BLUE, myCanvas, 0);
        }
        return totalArea;
    }

    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        Triangle tri = new Triangle(x,y,width,height);
        totalArea+=tri.calculateArea();
        can.drawShape(tri);
        if (level % 3 == 0){
            tri.setColor(Color.BLUE);
        }
        else if (level % 3 == 1){
            tri.setColor(Color.magenta);
        }
        else if (level % 3 == 2){
            tri.setColor(Color.yellow);
        }
        if (level<=7){
            drawTriangleFractal(width/2,height/2,x-width/2,y,c,can,level+1);
            drawTriangleFractal(width/2,height/2,x+width,y,c,can,level+1);
            drawTriangleFractal(width/2,height/2,x+width/4,y-height,c,can,level+1);
        }


    }

    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle cir = new Circle(x,y,radius);
        totalArea+=cir.calculateArea();
        can.drawShape(cir);
        if (level % 3 == 0){
            cir.setColor(Color.cyan);
        }
        else if (level % 3 == 1){
            cir.setColor(Color.orange);
        }
        else if (level % 3 == 2){
            cir.setColor(Color.green);
        }
        if (level<=7){
            drawCircleFractal(radius/2,x+radius,y,c,can,level+1);
            drawCircleFractal(radius/2,x-radius,y,c,can,level+1);
            drawCircleFractal(radius/2,x,y-radius,c,can,level+1);
            drawCircleFractal(radius/2,x,y+radius,c,can,level+1);
        }
    }


    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Rectangle rec = new Rectangle(x,y,width,height);
        totalArea += rec.calculateArea();
        can.drawShape(rec);
        if (level % 3 == 0){
            rec.setColor(Color.pink);
        }
        else if (level % 3 == 1){
            rec.setColor(Color.blue);
        }
        else if (level % 3 == 2){
            rec.setColor(Color.red);
        }
        if (level<=7){
            drawRectangleFractal(width/2, height/2, x-width/4,y-height/4,c,can,level+1);
            drawRectangleFractal(width/2, height/2, x-width/4,y+3*height/4,c,can,level+1);
            drawRectangleFractal(width/2, height/2, x+3*width/4,y-height/4,c,can,level+1);
            drawRectangleFractal(width/2, height/2, x+3*width/4,y+3*height/4,c,can,level+1);
        }
    }


    public static void main(String[] args){
        FractalDrawer FD = new FractalDrawer();
        System.out.println("What shape would you like to draw?");
        System.out.println("Options: circle, triangle, rectangle");
        Scanner myScanner = new Scanner(System.in);
        String userInput = myScanner.nextLine();
        System.out.println(FD.drawFractal(userInput));
    }
}
