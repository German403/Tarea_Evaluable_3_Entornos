package Tarea_Evaluable;

public class Cuadrado implements Figura{
    private String nombre;
    private int lado;

    public Cuadrado(String nombre, int lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    @Override
    public int area() {
        return lado*lado;
    }

    @Override
    public int perimetro() {
        return lado*4;
    }

    @Override
    public void duplica() {
        lado = lado*2;
    }

    @Override
    public void divide2() {
        lado = lado/2;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
