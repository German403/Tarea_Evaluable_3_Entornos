package Tarea_Evaluable;
import java.util.*;
import java.io.*;
public class Main {
    static ArrayList<Figura> Figuras = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void crearFigura(String[] parts) {
        String figura = parts[0];
        switch (figura) {
            case "Circulo":
                String nombreCirculo = parts[0];
                int radio = Integer.parseInt(parts[1]);
                Figuras.add(new Circulo(nombreCirculo, radio));
                break;
            case "Cuadrado":
                String nombreCuadrado = parts[0];
                int lado = Integer.parseInt(parts[1]);
                Figuras.add(new Cuadrado(nombreCuadrado, lado));
                break;
            case "Rectangulo":
                String nombreRecatangulo = parts[0];
                int base = Integer.parseInt(parts[1]);
                int altura = Integer.parseInt(parts[2]);
                Figuras.add(new Rectangulo(nombreRecatangulo, base, altura));
                break;
            default:
                System.out.println("Error en la creacion de las figuras");
        }//fin switch
    }

    public static void menu() {
        String fileName = ".\\src\\Tarea_Evaluable\\CSV Entornos.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0) {
                    crearFigura(parts);
                }
            }
        } catch (IOException e) {
            System.err.println("Error en la lectura del archivo: " + e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println();
            System.out.println("Seleccione una de las siguientes opciones");
            System.out.println("Seleccione 1 para calacular el area de las figuras");
            System.out.println("Seleccione 2 para calcular el perímetro de las figuras");
            System.out.println("Seleccione 3 para duplicar el tamaño de las figuras");
            System.out.println("Seleccione 4 para dividir el tamaño de las figuras entre dos");
            System.out.println("Seleccione 5 para salir del programa");
            opcion = sc.nextInt();
            sc.nextLine();

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
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }
    
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
            System.out.println("LISTA VACIA");
        }
    }

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
            System.out.println("LISTA VACÍA");
        }
    }

    public static void duplica(){
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
            System.out.println("LISTA VACÍA");
        }
    }

    public static void dividir2() {
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
            System.out.println("LISTA VACÍA");
        }
    }

    public static void main(String[] args) {
        menu();
    }

}

