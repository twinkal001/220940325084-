class Shape {
    void draw() {
        System.out.println("The Shape is drawn");
    }
    void erase() {
        System.out.println("The Shape is erased");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("The Circle is drawn");
    }

    @Override
    void erase() {
        System.out.println("The Circle is erased");
    }
}
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("The Triangle is drawn");
    }

    @Override
    void erase() {
        System.out.println("The Triangle is erased");
    }
}
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("The Square is drawn");
    }

    @Override
    void erase() {
        System.out.println("The Square is erased");
    }
}
public class q3 {
    public static void main(String[] args) {
        Shape cir_obj = new Circle();
        Shape tri_obj = new Triangle();
        Shape squ_obj = new Square();

        cir_obj.draw();
        cir_obj.erase();
        tri_obj.draw();
        tri_obj.erase();
        squ_obj.draw();
        squ_obj.erase();
    }
}