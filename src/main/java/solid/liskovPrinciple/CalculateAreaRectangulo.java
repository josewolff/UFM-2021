package solid.liskovPrinciple;

public class CalculateAreaRectangulo extends CalculoArea {

    @Override
    public void calculareArea() {
        super.calculareArea();
        System.out.println("Algo especifico para el Rectangulo.");
    }
}
