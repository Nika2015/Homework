
public class Rectangle {
    double height;
    double width;

    //double Ax;
    //double Ay;
    //double Bx;
    //double By;
    double area() {
        return height * width;
    }

    double perimeter() {
        return 2 * (height + width);
    }

    void douvleThis() {
        height *= 2;
        width *= 2;
    }
    void increasNtimes(int n)
    {
        height*=n;
        width*=n;
    }
    public String toString() {
        return "width: " + width + ", height: " + height;
    }
}

