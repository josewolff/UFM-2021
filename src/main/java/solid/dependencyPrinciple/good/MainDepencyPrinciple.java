package solid.dependencyPrinciple.good;

import java.util.ArrayList;
import java.util.List;

public class MainDepencyPrinciple {

    public static void main(String[] args){
        List<Empleado> empleadoArrayList =  new ArrayList<>();

        Ingenieria ingenieria = new Ingenieria();
        empleadoArrayList.add(ingenieria);

        Ventas ventas = new Ventas();
        empleadoArrayList.add(ventas);

    }
}
