import java.util.Scanner;

class Meetodos1{

    public static void main(String[] args){
        Edad edad = new Edad(); 
        LLamadas llamadas = new LLamadas();
        Scanner entrada = new Scanner(System.in);
        String opc="";
        String tipollam="";
        System.out.println("Escoje la opcion deseada");
        System.out.println("1.-Edades.");
        System.out.println("2.-Areas y perimetros.");
        System.out.println("3.-LLamadas.");
        opc = System.console().readLine();
        switch (opc) {
            case "1":
                System.out.println("Ingresa su dia de nacimiento");
                edad.setdia(entrada.nextInt());
                System.out.println("Ingresa su mes de nacimiento");
                edad.setmes(entrada.next());
                System.out.println("Ingresa su año de nacimiento");
                edad.setanos(entrada.nextInt());        
                edad.calcula(edad.getdia(),edad.getmes(),edad.getanos());
                break;
            case "2":
             Circulo circulo= new Circulo();
             Rectangulo rectangulo = new Rectangulo();
             Triangulo triangulo = new Triangulo();
             Cuadrado cuadrado= new Cuadrado();
             String op="";
             System.out.println("Escoje la opcion deseada");
             System.out.println("1.-Area y perimetro de un circulo.");
             System.out.println("2.-Area y perimetro de un rectangulo.");
             System.out.println("3.-Area y perimetro de un cuadrado.");
             System.out.println("4.-Area y parimetro de un triangulo.");
             op = System.console().readLine();
             switch (op) {
                case "1":
                    System.out.println("Inserte el radio");
                    circulo.setradio(entrada.nextFloat());
                    circulo.Area(circulo.getradio());
                    circulo.Perimetro(circulo.getradio());
                    break;
                case "2":
                    System.out.println("Inserte la altura");
                    rectangulo.seth(entrada.nextFloat());
                    System.out.println("Inserte la base");
                    rectangulo.setb(entrada.nextFloat());
                    rectangulo.Area(rectangulo.geth(), rectangulo.getb());
                    rectangulo.Perimetro(rectangulo.geth(), rectangulo.getb());
                    break;
                case "3":
                    System.out.println("Inserte un lado");
                    cuadrado.setb(entrada.nextFloat());
                    cuadrado.Area(cuadrado.getb());
                    cuadrado.Perimetro(cuadrado.getb());
                    break;
                case "4":
                    System.out.println("Inserte la base");
                    triangulo.setb(entrada.nextFloat());
                    System.out.println("Inserte la altura");
                    triangulo.seth(entrada.nextFloat());
                    System.out.println("Inserte la otro lado");
                    triangulo.setb2(entrada.nextFloat());
                    System.out.println("Inserte el ultimo lado");
                    triangulo.setb3(entrada.nextFloat());
                    triangulo.Area(triangulo.geth(), triangulo.getb());
                    triangulo.Perimetro(triangulo.getb(), triangulo.getb2(), triangulo.getb3());
                    break;
                default:
                    System.out.println("Ingresa un caracter valido.");
                    break;
                 }
                break;
            case "3":
             System.out.println("Precione el tipo de llamada");
             System.out.println("Marque 1 si su llamada es Local Nacional");
             System.out.println("Marque 2 si su llamada es Local Internacional");
             System.out.println("Marque 3 si su llamada es Celular");
             tipollam = System.console().readLine();
             switch (tipollam) {
                 case "1":
                     System.out.println("Ingrese el numero que desea marcar");
                     llamadas.setnumtel(entrada.nextInt());
                     System.out.println("Ingrese su credito");
                     llamadas.setcredito(entrada.nextInt());
                     System.out.println("Ingrese la duracion de la llamada");
                     llamadas.setduracion(entrada.nextInt());
                     llamadas.Nacionales(llamadas.getcredito(),llamadas.getduracion());
                     break;
                 case "2":
                     System.out.println("Ingrese el numero que desea marcar");
                     llamadas.setnumtel(entrada.nextInt());
                     System.out.println("Ingrese su credito");
                     llamadas.setcredito(entrada.nextInt());
                     System.out.println("Ingrese la duracion de la llamada");
                     llamadas.setduracion(entrada.nextInt());
                     llamadas.Internacionales(llamadas.getcredito(),llamadas.getduracion());
                     break;
                 case "3":
                     System.out.println("Ingrese el numero que desea marcar");
                     llamadas.setnumtel(entrada.nextInt());
                     System.out.println("Ingrese su credito");
                     llamadas.setcredito(entrada.nextInt());
                     System.out.println("Ingrese la duracion de la llamada");
                     llamadas.setduracion(entrada.nextInt());
                     llamadas.Celulares(llamadas.getcredito(),llamadas.getduracion());
                     break;
                 default:
                     System.out.println("Ingresa un caracter valido.");
                     break;
                }
             break;
            default:
                 System.out.println("Ingresa un caracter valido.");
                 break;
        }
        
    }
}