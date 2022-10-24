package StructuralDP.DecoratorDP;

public class NormalSample {
    public static class Iphone11 {
        public String name() {
            return "Iphone 11";
        }

        int getCameraCount(){
            return 2;
        }
    }

    public static class Iphone11Pro{
        public String name() {
            return "Iphone 11 pro";
        }

        int getCameraCount(){
            return 3;
        }
    }

    public static class Iphone11ProMax{
        public String name() {
            return "Iphone 11 pro Max";
        }

        int getCameraCount(){
            return 3;
        }
    }
}