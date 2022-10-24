package StructuralDP.DecoratorDP;

public class DecoratorRunner {
    public static void main(String[] args) {

        Phone phone=new  Iphone11ProMax(new IPhone());

        System.out.println("name: "+phone.getName());
        System.out.println("price: "+phone.getPrice());
        System.out.println("camera count: "+phone.cameraCount());
    }
}
