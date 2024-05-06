package Tarea_Evaluable;

public class Rectangulo implements Figura{
    private String nombre;
    private int base;
    private int altura;

    public Rectangulo(String nombre, int base, int altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int area() {
        return base * altura;
    }

    @Override
    public int perimetro() {
        return (base*2) + (altura*2);
    }

    @Override
    public void duplica() {
        base = base*2;
        altura = altura*2;
    }

    @Override
    public void divide2() {
        base = base/2;
        altura = altura*2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
