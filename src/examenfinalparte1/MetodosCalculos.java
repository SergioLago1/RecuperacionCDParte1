package examenfinalparte1;

public class MetodosCalculos {

    int i;
/**
     * Pasandole los parámetros j y m de tipo int realiza una operación mediante el método Suma con los datos introducidos.
     * Una vez realizada la operación asigna el resultado a la variable i.
     * @param m variable de tipo int
     * @param j variable de tipo int
     */
    public MetodosCalculos(int j, int m) {
        i = Suma(j, m);
    }
 /**
  * Pasandole unicamente el parametro j realizará la operación del metodo Suma, sumará j+j.
  * Recoge el resultado de la operación en la variable i.
  * @param j variable de tipo int
  */
    public MetodosCalculos(int j) {
        i = Suma(j, j);
    }
 /**
  * La variable i,valdrá -1.
  */
    public MetodosCalculos() {
        i = -1;
    }
/**
     * Método que contiene la operación principal, a partir de este método realizaremos los demás.
     * Realiza una suma mediante 2 variable x y x1.
     * @param x variabe de tipo int
     * @param x1 variable de tipo int
     * @return la suma
     */
    public int Suma(int x, int x1) {
        return x + x1;
    }
}
