package examenfinalparte1;

public class MetodosCalculos {

    int i;

    public MetodosCalculos(int j, int m) {
        i = Suma(j, m);
    }

    public MetodosCalculos(int j) {
        i = Suma(j, j);
    }

    public MetodosCalculos() {
        i = -1;
    }

    public int Suma(int x, int x1) {
        return x + x1;
    }
}
