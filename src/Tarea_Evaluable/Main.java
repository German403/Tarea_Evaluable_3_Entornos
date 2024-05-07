package Tarea_Evaluable;
import java.util.*;
import java.io.*;
public class Main {
    static ArrayList<Figura> Figuras = new ArrayList<>();
    public static boolean repetir = false;
    public static Scanner sc = new Scanner(System.in);

    public static void crearFigura(String[] separador) {
        String figura = separador[0];
        switch (figura) {
            case "Circulo":
                String nombreCirculo = separador[0];
                int radio = Integer.parseInt(separador[1]);
                Figuras.add(new Circulo(nombreCirculo, radio));
                break;
            case "Cuadrado":
                String nombreCuadrado = separador[0];
                int lado = Integer.parseInt(separador[1]);
                Figuras.add(new Cuadrado(nombreCuadrado, lado));
                break;
            case "Rectangulo":
                String nombreRecatangulo = separador[0];
                int base = Integer.parseInt(separador[1]);
                int altura = Integer.parseInt(separador[2]);
                Figuras.add(new Rectangulo(nombreRecatangulo, base, altura));
                break;
            default:
                System.out.println("Error en la creacion de las figuras");
        }//fin switch
    }//Fin del metodo crearFigura

    public static int menu() {
        int opcion = 0;
        do{
            repetir = false;
            try{
                System.out.println();
                System.out.println("Seleccione una de las siguientes opciones");
                System.out.println("Seleccione 1 para calacular el area de las figuras");
                System.out.println("Seleccione 2 para calcular el perímetro de las figuras");
                System.out.println("Seleccione 3 para duplicar el tamaño de las figuras");
                System.out.println("Seleccione 4 para dividir el tamaño de las figuras entre dos");
                System.out.println("Seleccione 5 para salir del programa");
                opcion = sc.nextInt();
                if(opcion < 1 || opcion > 5){
                    throw new IllegalAccessException();
                }
            }catch (InputMismatchException e1){
                System.err.println("Valor no valido, error de formato");
                sc.nextLine();
                repetir = true;
            }catch (IllegalAccessException e2){
                System.err.println("Las opciones son de 1 a 5");
                repetir = true;
            }
        }while(repetir);
        return opcion;
    }//Fin del metodo menu

    public static void ejecucion(){
        lecturaArchivo();
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    area();
                    break;
                case 2:
                    perimetro();
                    break;
                case 3:
                    duplica();
                    break;
                case 4:
                    dividir2();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 5);
    }//Fin del metodo ejecucion

    private static void lecturaArchivo() {
        String fileName = ".\\src\\Tarea_Evaluable\\CSV Entornos.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] separador = line.split(";");
                if (separador.length > 0) {
                    crearFigura(separador);
                }
            }
        } catch (IOException e) {
            System.err.println("Error en la lectura del archivo: " + e.getMessage());
        }
    }//Fin del metodo lecturaArchivo

    public static void area() {
        if (!Figuras.isEmpty()) {
            for (Figura figura : Figuras) {
                if (figura instanceof Circulo) {
                    Circulo circulo = (Circulo) figura;
                    int areaCirculo = circulo.area();
                    System.out.println("El area del circulo es: "+areaCirculo);
                } else if (figura instanceof Cuadrado) {
                    Cuadrado cuadrado = (Cuadrado) figura;
                    int areaCuadrado = cuadrado.area();
                    System.out.println("El area del cuadrado es: "+areaCuadrado);
                } else if (figura instanceof Rectangulo) {
                    Rectangulo rectangulo = (Rectangulo) figura;
                    int areaRectangulo = rectangulo.area();
                    System.out.println("El area del rectangulo es: "+areaRectangulo);
                } else {
                    System.out.println("No existe la figura indicada");
                }
            }
        } else {
            System.out.println("La lista de figuras está vacía");
        }
    }//Fin del metodo area

    public static void perimetro() {
        if (!Figuras.isEmpty()) {
            for (Figura figura : Figuras) {
                if (figura instanceof Circulo) {
                    Circulo circulo = (Circulo) figura;
                    int perimetroCirculo = circulo.perimetro();
                    System.out.println("El perímetro del círculo es: " + perimetroCirculo);
                } else if (figura instanceof Cuadrado) {
                    Cuadrado cuadrado = (Cuadrado) figura;
                    int perimetroCuadrado = cuadrado.perimetro();
                    System.out.println("El perímetro del cuadrado es: " + perimetroCuadrado);
                } else if (figura instanceof Rectangulo) {
                    Rectangulo rectangulo = (Rectangulo) figura;
                    int perimetroRectangulo = rectangulo.perimetro();
                    System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);
                } else {
                    System.out.println("No existe la figura indicada");
                }
            }
        } else {
            System.out.println("La lista de figuras está vacía");
        }
    }//Fin del metodo perimetro

    public static void duplica() {
        if (!Figuras.isEmpty()) {
            for (Figura figura : Figuras) {
                try {
                    if (figura instanceof Circulo) {
                        Circulo circulo = (Circulo) figura;
                        circulo.duplica();
                        System.out.println("El " + circulo.getNombre() + " tiene un valor del radio de " + circulo.getRadio());
                        if (circulo.getRadio() >= 1000){
                            throw new IllegalAccessException();
                        }
                    } else if (figura instanceof Cuadrado) {
                        Cuadrado cuadrado = (Cuadrado) figura;
                        cuadrado.duplica();
                        System.out.println("El " + cuadrado.getNombre() + " tiene un valor del lado de " + cuadrado.getLado());
                        if (cuadrado.getLado() >= 1000){
                            throw new IllegalAccessException();
                        }
                    } else if (figura instanceof Rectangulo) {
                        Rectangulo rectangulo = (Rectangulo) figura;
                        rectangulo.duplica();
                        System.out.println("El " + rectangulo.getNombre() + " tiene valor de la base de " + rectangulo.getBase() + " tiene valor de la altura de " + rectangulo.getAltura());
                        if (rectangulo.getBase() >= 1000){
                            throw new IllegalAccessException();
                        }
                    } else {
                        System.out.println("No existe esta figura");
                    }
                }catch (IllegalAccessException e) {
                    System.err.println("Una de las figuras tiene un valor superior o igual a 1000");
                    dividir2();
                }//Fin try-catch
            }//Fin for
        } else {
            System.out.println("La lista de figuras está vacía");
        }//Fin de if-else
    }//Fin del metodo duplica

    public static void dividir2() {
        if (!Figuras.isEmpty()) {
            for (Figura figura : Figuras) {
                try {
                    if (figura instanceof Circulo) {
                        Circulo circulo = (Circulo) figura;
                        circulo.divide2();
                        System.out.println("El " + circulo.getNombre() + " tiene un valor del radio de " + circulo.getRadio());
                        if (circulo.getRadio() <= 0){
                            throw new IllegalAccessException();
                        }
                    } else if (figura instanceof Cuadrado) {
                        Cuadrado cuadrado = (Cuadrado) figura;
                        cuadrado.divide2();
                        System.out.println("El " + cuadrado.getNombre() + " tiene un valor del lado de " + cuadrado.getLado());
                        if (cuadrado.getLado() <= 0){
                            throw new IllegalAccessException();
                        }
                    } else if (figura instanceof Rectangulo) {
                        Rectangulo rectangulo = (Rectangulo) figura;
                        rectangulo.divide2();
                        System.out.println("El " + rectangulo.getNombre() + " tiene valor de la base de " + rectangulo.getBase() + " tiene valor de la altura de " + rectangulo.getAltura());
                        if (rectangulo.getBase() <= 0){
                            throw new IllegalAccessException();
                        }
                    } else {
                        System.out.println("No existe esta figura");
                    }
                }catch (IllegalAccessException e) {
                    System.err.println("Una de las figuras tiene un valor inferior o igual a 0");
                }//Fin try-catch
            }//Fin for
        } else {
            System.out.println("La lista de figuras está vacía");
            duplica();
        }//Fin de if-else
    }//Fin  del metodo dividir2

    public static void main(String[] args) {
        ejecucion();
    }
}
