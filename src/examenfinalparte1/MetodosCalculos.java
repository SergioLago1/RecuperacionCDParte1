package examenfinalparte1;

public class MetodosCalculos {

    int i;
/**
     * Pasandole los parámetros j y m de tipo int realiza una operación mediante el método Suma con los datos introducidos.
     * Una vez realizada la operación asigna el resultado a la variable i.
     *  Modificado el constuctor. Pasa a ser un método de tipo int. Para facilitar así diferenciarlo de los otros metodos a la hora de llamarlo.
     * @param m variable de tipo int
     * @param j variable de tipo int
     */
    
    public int SumaVariablesDistintas(int j, int m){
        i = Suma(j, m);
        return i;
    }
 /**
  * Pasandole unicamente el parametro j realizará la operación del metodo Suma, sumará j+j.
    * Recoge el resultado de la operación en la variable i.
  * Modificado el constuctor. Pasa a ser un método de tipo int. Para facilitar así diferenciarlo de los otros metodos a la hora de llamarlo.
  * @param j variable de tipo int
  */
   public int SumaMismaVariable(int j){
        i = Suma(j, j);
        return i;
    }
 /**
  * La variable i,valdrá -1.
  * Modificado el constuctor. Pasa a ser un método de tipo int. Para facilitar así diferenciarlo de los otros metodos a la hora de llamarlo.
  */
   public int VariableMenosUno() {
        i = -1;
        return i;
    }
/**
     * Método que contiene la operación principal, a partir de este método realizaremos los demás.
     * Realiza una suma mediante 2 variable x y x1.
     * @param x variabe de tipo int
     * @param x1 variable de tipo int
     * @return la suma de x+x1
     */
    public int Suma(int x, int x1) {
        return x + x1;
    }
}
