package examenfinalparte1;

import java.io.IOException;

public class PrinResultados {

    public static void main(String[] args) throws IOException {
       /**
        * Creaundo un objeto de tipo MetodosCalculos llamamos a los metodos de esa clase.
        * En el primer caso llamamos a SumaVariablesDistintas, pasandole dos parametros hará la suma entre ambos.
        * El System.out.print nos mostrara el resultado.
        */
        MetodosCalculos obj = new MetodosCalculos();
        int n = obj.SumaVariablesDistintas(10,20);
        System.out.println("Es: " + n);
       /**
         * Llamando al metodo SumaMismaVariable realizará un calculo enviandole una unica variable.
         * El System.out.print nos mostrara el resultado.
         */
        MetodosCalculos nm = new MetodosCalculos();
        int m = nm.SumaMismaVariable(10);
        System.out.println("Es: " + m);
        /**
         * Llamando a el metodo VariableMenosUno asignaremos el valor -1 a la variale int nn.
         * El System.out.print nos mostrara el resultado.
         */
        MetodosCalculos mn = new MetodosCalculos();
        int nn = mn.VariableMenosUno();
        System.out.println("Es: " + nn);
        
    }
}