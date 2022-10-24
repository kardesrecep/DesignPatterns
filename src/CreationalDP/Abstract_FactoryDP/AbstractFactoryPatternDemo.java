package CreationalDP.Abstract_FactoryDP;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //circle objesi oluşturuldu
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        //regtangle objesi oluşturuldu
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //color fabrikası oluşturtalım
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //RED objesi oluşturalım
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        //Blue objesi oluşturuldu
        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();
    }
}
