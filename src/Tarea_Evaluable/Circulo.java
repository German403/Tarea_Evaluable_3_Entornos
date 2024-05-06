package Tarea_Evaluable;

public class Circulo implements Figura{
    private String nombre;
    private int radio;

    public Circulo(String nombre, int radio){
        this.nombre = nombre;
        this.radio = radio;
    }

    @Override
    public int area(){
        return (int) (Math.PI * (radio*radio));
    }

    @Override
    public int perimetro(){
        return  (int) (2 * Math.PI * radio);
    }

    @Override
    public void duplica(){
        radio = radio * 2;
    }

    @Override
    public void divide2(){
         radio = radio / 2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
