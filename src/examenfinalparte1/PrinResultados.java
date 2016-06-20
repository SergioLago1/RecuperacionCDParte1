package examenfinalparte1;

import java.io.IOException;

public class PrinResultados {

    public static void main(String[] args) throws IOException {
       
        MetodosCalculos obj = new MetodosCalculos();
        int n = obj.SumaVariablesDistintas(10,20);
        System.out.println("Es: " + n);
       
        MetodosCalculos nm = new MetodosCalculos();
        int m = nm.SumaMismaVariable(10);
        System.out.println("Es: " + m);
        
        MetodosCalculos mn = new MetodosCalculos();
        int nn = mn.VariableMenosUno();
        System.out.println("Es: " + nn);
        
    }
}