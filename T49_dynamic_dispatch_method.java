class  Phone{
    public void radio(){
        System.out.println("Turning On Radio");
    }
    public void on(){
        System.out.println("turning ON");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Turning On Music");
    }
    public void on(){
        System.out.println("Turning On smartphone");
    }
}
public class T49_dynamic_dispatch_method {
    public static void main(String[] args) {
        //dynamic method dispatch
        Phone obj = new SmartPhone();
        obj.radio(); //allowed
//        obj.music();   --> not allowed
        obj.on();
    }
}
