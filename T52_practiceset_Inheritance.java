class MyCircle{

    double area(int r){
        return 3.14 * r * r;
    }
}
class MyCylinder extends MyCircle{
    double volume(int r,int h){
        return 3.14 * r * r * h;
    }
}
class Rectangle{
    int length;
    int breadth;
    int height;
    int Volume(int l,int b){
        length = l;
        breadth = b;
        return l*b;
    }
}
class Cuboid extends Rectangle{
    int height;
    int Volume(int l,int b,int h){
        height = h;
        return l*b*h;
    }
}

public class T52_practiceset_Inheritance {
    public static void main(String[] args) {
        MyCylinder circ = new MyCylinder();
//        System.out.println(circ.area(5,5));
        Cuboid rec = new Cuboid();
        System.out.println(rec.Volume(4,5,5));
    }
}
