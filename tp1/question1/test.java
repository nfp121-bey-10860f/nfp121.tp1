package question1;

public class test{
    public static void main (String []args){
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        circle.makeInvisible ();
        circle.makeVisible();
        circle.moveRight();
        circle.moveLeft();
        circle.moveUp();
        circle.moveDown();
        circle.moveHorizontal(5);
        circle.moveVertical(5);
        circle.slowMoveHorizontal(5);
        circle.slowMoveVertical(5);
        circle.changeSize(5);
        circle.changeColor("black");
        triangle.makeInvisible();
        triangle.makeVisible();
        triangle.moveRight();
        triangle.moveLeft();
        triangle.moveUp();
        triangle.moveDown();
        triangle.moveHorizontal(5);
        triangle.moveVertical(5);
        triangle.slowMoveHorizontal(5);
        triangle.slowMoveVertical(5);
        triangle.changeSize(5,10);
        triangle.changeColor("black");
        square.makeInvisible();
        square.makeVisible();
        square.moveRight();
        square.moveLeft();
        square.moveUp();
        square.moveDown();
        square.moveHorizontal(5);
        square.moveVertical(5);
        square.slowMoveHorizontal(5);
        square.slowMoveVertical(5);
        square.changeSize(5);
        square.changeColor("black");
    
    }
}