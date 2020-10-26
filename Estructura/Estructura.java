import java.util.Scanner;

class Estructura{

    public static void main(String[] args){
       
        Scanner entrada = new Scanner(System.in);
        
        String opcion = " ";
        int edad, abono, a, base, altura, perimetro, area, b, numero, exp, valido, num1,  total, pro, num, salidaf;
        long factorial=1;
        String op="";
        String opc2="";
        String opc3="";
        String opc4="";
        String rep="";
        String producto="";
        double resultado = 0 ;
        double descuento, decimal, binario, volumen, radio, nuevt, temperatura;
        int agua, coca, caguama, chetos, huevoKinder, galletas, leche;
        float x, y;
        do{
          System.out.println("3IV9_Ceron_Villanueva_Donovan");
           System.out.println("Bienvenido soy Donovan creador del programa para empezar: ");
           System.out.println("Elija una de las siguientes opciones:");
           System.out.println("1.-Abonos");
           System.out.println("2.-Decimales a codigo Binario");
           System.out.println("3.-Convercion de temperatura");
           System.out.println("4.-Contador de numeros positivos y negativos");
           System.out.println("5.-Factura");
           System.out.println("6.-Areas, Perimetros y Volumenes");
           System.out.println("7.-Tabla de valores");
           System.out.println("8.-Calcular factorial");
           System.out.println("9.-Calculadora");
           System.out.println("S.-Salir");

           opcion = System.console().readLine();
           switch(opcion){
             case "1":
                System.out.println("Igrese su edad");
                edad = entrada.nextInt();
                System.out.println("Ingrese la cantidad del abono");
                abono = entrada.nextInt();
                if(edad > 64){
                     descuento = abono * .60;
                     System.out.println("Obtubo un descueto de 40%, el nuvo total es: "+ descuento);
                 }else{
                if(edad < 22 ){
                     System.out.println("Tus padres son socios?");
                     System.out.println("Preciona 1 si tu respuesta es afirmativa, si no, preciona cualquier numero");
                     a = entrada.nextInt();
                     if(a == 1){
                          descuento = abono * .55;
                          System.out.println("Obtubo un descueto de 45%, el nuvo total es: "+ descuento);
                         }else{
                     descuento = abono * .75;
                     System.out.println("Obtubo un descueto de 25%, el nuvo total es: "+ descuento);
                     } 
                 }else{
                     System.out.println("Tu no aplicas para ningun descuento");
                     }
                    }               
                break;
             case "2": 
                int digito, numero2;
                Scanner sc = new Scanner(System.in);
                System.out.println("A continuacion introduce un numero completamente decimal (Sin numero entero y SIN PUNTO DECIMAL");
                do{ 
                     System.out.print("Introduce un numero entero >= 0: ");                                                
                     numero2 = sc.nextInt();
               }while(numero2 < 0);
   
                exp=0;
                binario=0;
                while(numero2!=0){
                     digito = numero2 % 2;           
                     binario = binario + digito * Math.pow(10, exp);                                                   
                      exp++;
                     numero2 = numero2/2;
                    }
                System.out.printf("Binario: %.0f %n", binario);
              break;

             case "3":
                System.out.println("Elija una de las siguientes opciones");
                System.out.println("1.-Fahrenheit a Celsius");
                System.out.println("2.-Fahrenheit a Kelvin");
                System.out.println("3.-Fahrenheit a Rankine");
                System.out.println("4.-Celsius a Fahrenheit");
                System.out.println("5.-Celsius a Kelvin ");
                System.out.println("6.-Celsius a Rankine ");
                System.out.println("7.-Kelvin a Fahrenheit");
                System.out.println("8.-Kelvin a Celsius");
                System.out.println("9.-Kelvin a Rankine");
                System.out.println("10.-Rankine a Fahrenheit");
                System.out.println("11.-Rankine a Celsius");
                System.out.println("12.-Rankine a kelvin");
                opcion = System.console().readLine();
                nuevt = 0;
                switch (opcion) {
                 case "1":
                     System.out.println("Introdusca la temperatura en Fahrenheit");
                     temperatura = entrada.nextInt();
                     nuevt = 5*(temperatura - 32)/9;
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                      break;
                 case "2":
                     System.out.println("Introdusca la temperatura en Fahrenheit");
                     temperatura = entrada.nextInt();
                     nuevt = 5*(temperatura -32)/9+273.15; 
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                     break;
                 case "3":
                     System.out.println("Introdusca la temperatura en Fahrenheit");
                     temperatura = entrada.nextInt();
                     nuevt = (temperatura + 459.67);
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                     break;
                 case "4":
                      System.out.println("Introdusca la temperatura en Celsius");
                      temperatura = entrada.nextInt();
                      nuevt = (9 * temperatura)/5 + 32;
                      System.out.println("El resultado de la convercion es de: "+nuevt);
                     break;
                 case "5":
                     System.out.println("Introdusca la temperatura en Celsius");
                     temperatura = entrada.nextInt();
                     nuevt = (temperatura +273.15);
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                     break;
                 case "6":
                     System.out.println("Introdusca la temperatura en Celsius");
                     temperatura = entrada.nextInt();
                     nuevt = (9 * temperatura) /5 +491.67;
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                     break;
                 case "7":
                     System.out.println("Introdusca la temperatura en Kelvin");
                     temperatura = entrada.nextInt();
                     nuevt = 9*(temperatura -273.15) /5 +32;
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                     break;
                 case "8":
                     System.out.println("Introdusca la temperatura en Kelvin");
                     temperatura = entrada.nextInt();
                     nuevt = (temperatura -273.15);
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                     break;
                 case "9":
                     System.out.println("Introdusca la temperatura en Kelvin");
                     temperatura = entrada.nextInt();
                     nuevt = 9*(temperatura -273.15) /5 +491.67;
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                      break;
                 case "10":
                     System.out.println("Introdusca la temperatura en Rankine");
                     temperatura = entrada.nextInt();
                     nuevt = (temperatura -459.67);
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                      break;
                 case "11":
                     System.out.println("Introdusca la temperatura en Rankine");
                     temperatura = entrada.nextInt();
                     nuevt = 5*(temperatura -491.67) /9;
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                      break;
                 case "12":
                     System.out.println("Introdusca la temperatura en Rankine");
                     temperatura = entrada.nextInt();
                     nuevt = 5*(temperatura -491.67) /9 +273.15;
                     System.out.println("El resultado de la convercion es de: "+nuevt);
                      break;
                 default:
                     System.out.println("No estava lo que buscabas?");
                   break;
                 }
             case "4":
                 a=0;
                 b=0;
                System.out.println("A continuasion ingresa numeros ya sean positivos No olvides poner 0 cuando termines");
                do{
                     num1 = entrada.nextInt(); 
                     if(num1 > 0){
                          a = a + 1;
                     }else{
                          b = b + 1;
                    }
     
                }while(num1!=0);
                b = b - 1;
                System.out.println("El total de numeros positivos es: "+a);
                System.out.println("El total de numeros negativos es: "+b);
               break; 
             case "5":
                agua = 8;
                coca =15;
                caguama = 30;
                chetos = 12;
                huevoKinder = 20; 
                galletas = 13;
                leche = 17;
                System.out.println("Itrodusca el nombre clave de los productos que desea comprar y para finalizar ocupar 0");
                System.out.println("1.-Agua");
                System.out.println("2.-Coca");
                System.out.println("3.-Caguama");
                System.out.println("4.-Chetos");
                System.out.println("5.-Huevo Kinder");
                System.out.println("6.-Galletas");
                System.out.println("7.-Leche");
                pro = 0;
                total = 0;
                do{
                     producto  = System.console().readLine();
                     pro = pro + 1;
                     switch (producto) {
                          case "1":
                               total =total + 8;
                               break;
                          case "2":
                               total = total + 15;
                               break;
                          case "3":
                               total = total + 30;
                               break;
                          case "4":
                               total = total + 12;
                               break;
                          case "5":
                               total = total + 20;
                               break;
                          case "6":
                               total = total + 13;
                               break;
                          case "7":
                               total = total + 17;
                               break;
                          default:
                               break;
                     }
                }while(!producto.equalsIgnoreCase("0"));
                pro = pro - 1;
                System.out.println("El total de la compra es de: "+total);
                System.out.println("La cantidad de producros comprados es de: "+pro);
                break;
             case "6": 
              System.out.println("Escoge una de las siguientes opciones para calcular");
              System.out.println("1.-Area y perimetro de un rectangulo");
              System.out.println("2.-Area y perimetro de un triangulo");
              System.out.println("3.-Volumen de una esfera");
              System.out.println("4.-Volumen de un cilindro");
              opc3 = System.console().readLine();
              switch (opc3) {
                    case "1":
                        System.out.println("Introduce la base");
                        base = entrada.nextInt();
                        System.out.println("Introduce la altura");
                        altura = entrada.nextInt();
                        area = base * altura;
                        perimetro = base + base + altura +altura;
                        System.out.println("El area es: "+area);
                        System.out.println("El perimetro es: "+perimetro);
                     break;
                    case "2":
                        System.out.println("Escoje un triangulo de los siguientes:");
                        System.out.println("1.-Triangulo equilatero");
                        System.out.println("2.-Triangulo isoseles");
                        System.out.println("3.-Triangulo escaleno");
                         opc4 = System.console().readLine();
                        switch (opc4) {
                             case "1":
                                    System.out.println("Introduce la altura");
                                    altura = entrada.nextInt();
                                    System.out.println("Introduce la base");
                                    base = entrada.nextInt();
                                    area = (base * altura)/2;
                                    perimetro = base + base + base;
                                    System.out.println("El area es: "+area);
                                    System.out.println("El perimetro es: "+perimetro);
                                  break;
                              case "2":
                                    System.out.println("Introduce la altura");
                                    altura = entrada.nextInt();
                                    System.out.println("Introduce la base");
                                    base = entrada.nextInt();
                                    System.out.println("Introduce el lado diferente");
                                    a = entrada.nextInt();
                                    area = (base * altura)/2;
                                    perimetro = base + base + a;
                                    System.out.println("El area es: "+area);
                                    System.out.println("El perimetro es: "+perimetro);
                               break;
                              case "3":
                                    System.out.println("Introduce la altura");
                                    altura = entrada.nextInt();
                                    System.out.println("Introduce la base");
                                    base = entrada.nextInt();
                                    System.out.println("Introduce uno de los lados diferentes");
                                    a = entrada.nextInt();
                                    System.out.println("Itroduce el ultimo lado que no sea registrado");
                                    b = entrada.nextInt();
                                    area = (base * altura)/2;
                                    perimetro = base + b + a;
                                    System.out.println("El area es: "+area);
                                    System.out.println("El perimetro es: "+perimetro);
                                    break;
                             default:
                                    System.out.println("Atiende las indicaciones por favor.");
                                  break;
                        }
                     break;
                    case "3":
                          System.out.println("Introduce el radio");
                          radio = entrada.nextInt();
                          volumen = 4/3 * 3.1416 * (radio * radio * radio);
                          System.out.println("El volumen es de: "+volumen);
                     break;
                    case "4":
                        System.out.println("Introdusca la altura");
                        altura = entrada.nextInt();
                        System.out.println("Introduce el radio");
                        radio = entrada.nextInt();
                        volumen = altura * 3.1416 * (radio * radio);
                        System.out.println("El volumen es de: "+volumen);
                     break;
                    default:
                          System.out.println("Pues no se que quieras hacer");
                      break;
                }
                break;
             case "7":
                System.out.println("N"); 	 
                System.out.println(" 1 10 100 1000");
                System.out.println(" 2 20 200 2000");
                System.out.println(" 3 30 300 3000");
                System.out.println(" 4 40 400 4000");
                System.out.println(" 5 50 500 5000");
                System.out.println(" 6 60 600 6000");
                System.out.println(" 7 70 700 7000");
                System.out.println(" 8 80 800 8000");
                System.out.println(" 9 90 900 9000");
                System.out.println("10 100 1000 1000");
              break;
             case "8":
                do{
                     System.out.println("1 Entrar al programa");
                     System.out.println("0 salir al menu principal");
                     salidaf = entrada.nextInt();
                     if(salidaf==1){
                          System.out.print("Introduce un numero: ");
                          num = entrada.nextInt();
                     for (int i = num; i > 0; i--) {
                          factorial = factorial * i;
                         }
                     System.out.println("El factorial de " + num + " es: " + factorial);
                     }
                    }while(salidaf!=0);
              break;
             case "9":
                //Si va a realizar operaciones impares sume o reste con cero despues de su ultipo nuemero y antes del igual
                System.out.println("No olvides poner el igual al finalizar");
                do{
                     System.out.println("Ingrese x: ");
                      x = entrada.nextFloat();
                     System.out.println("Ingrese operacion: ");
                     op = System.console().readLine();
                     System.out.println("Ingrese y: ");
                     y = entrada.nextFloat();
                     System.out.println("Ingrese operacion: ");
                     rep =System.console().readLine();
                     switch (op) {
                        case "+":
                          resultado = x + y;
                         break;
                        case "-":
                          resultado = x - y;
                         break;
                        case "*":
                          resultado = x * y;
                          break;
                        case "/":
                          resultado = x / y;
                         break;
                        default: 
                          rep = System.console().readLine();
                         break;    
                        }
                }while(!rep.equalsIgnoreCase("="));
                         System.out.println("El resultado es: "+resultado);
               break;
             case "S":
                System.out.println("Gracias por venir.");
              break;
             case "s":
                System.out.println("Gracias por venir.");
              break;
             default: 
                System.out.println("No creo poder ayudarte");
              }
          }while(!opcion.equalsIgnoreCase("S"));
     }
}