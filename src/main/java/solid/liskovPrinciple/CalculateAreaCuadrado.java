package solid.liskovPrinciple;

import jdk.swing.interop.SwingInterOpUtils;

public class CalculateAreaCuadrado extends CalculoArea {

    @Override
    public void calculareArea() {
        super.calculareArea();
        System.out.println("Algo especifico para el cuadrado.");
    }
}
