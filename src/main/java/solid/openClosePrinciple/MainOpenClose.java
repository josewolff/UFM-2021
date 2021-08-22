package solid.openClosePrinciple;

public class MainOpenClose {

    public static void main(String[] args){
        CalculareAreaCuadrado calculareAreaCuadrado =  new CalculareAreaCuadrado();
        calculareAreaCuadrado.calculateArea();

        CalculateAreaTriangule triangule = new CalculateAreaTriangule();
        triangule.calculateArea();

    }
}
