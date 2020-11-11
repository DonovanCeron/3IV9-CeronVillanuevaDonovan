import java.util.Scanner;
public class Arreglos{
    Scanner entrada=new Scanner(System.in);

    public void opciones(){



      
       
        
        Scanner entrada = new Scanner(System.in);
        String opcion = " ";
        do{
            System.out.println("Que programa quiere ejecutar?");
            System.out.println("1.-Promedio de positivos y negetivos");
            System.out.println("2.-Promedio de posisiones pares");
            System.out.println("3.-Promedio calificaciones");
            System.out.println("4.-Suma de matrizes");
            System.out.println("s.-Salir");
            opcion = System.console().readLine();
         switch (opcion) {
            case "1":
                promediopositivos();
            break;
            case "2":
                Promediopares();
            break;
            case "3":
                calificaciones();
            break;
            case "4":
                matriz();
            break;
            case "s":
             System.out.println("Gracias por venir");
            break;
            default:
             System.out.println("Ingrese una opcion valida");
            break;
         }
        }while(!opcion.equalsIgnoreCase("s"));
    }


    public void Promediopares(){

        int[] numeros = new int [10];
        float sumaP=0, sumaI=0;
        int contPP=0,contI=0;
        float promPP, promII;

         for(int i=0 ; i<10 ; i++){
             System.out.println("Introdusca un numero");
             numeros[i]=entrada.nextInt();
            }
         for(int i=0; i<10; i++){
             if(i%2==0){
                 sumaP=sumaP+numeros[i];
                 contPP++;
                }
             if(i%2==1){
                 sumaI=sumaI+numeros[i];
                 contI++;
                }
           }

         promPP=sumaP/contPP;
         promII=sumaI/contI;

         System.out.println(promPP+" promedio pares");
         System.out.println(promII+" promedio impares");
        }

    public void promediopositivos(){
            //Scanner entrada = new Scanner(System.in);


            int[] numeros = new int [10];
            int[] positivos = new int[10];
            int[] negativos = new int[10];
            int contp=0;
            int contn=0;
            int numero;
            double promedio;
            float promP, promN,acumP=0,acumN=0;


            for(int i=0 ; i<10 ; i++){
               System.out.println("Introdusca un numero");
               numeros[i]=entrada.nextInt();
              }

            for(int i=0; i<10; i++){
               if(numeros[i]>0){
                    positivos[i]=numeros[i];
                    contp++;
                   }
               if(numeros[i]<0){
                    negativos[i]=numeros[i];
                    contn++;
                  }
              }

            for(int i=0 ; i<10 ; i++){
                acumP=acumP+positivos[i];
                acumN=acumN+negativos[i];
              }  
      
            promP=acumP/contp;
            promN=acumN/contn;
      
            System.out.println("promedio positivo "+promP);
            System.out.println("Promedio negativo "+promN);   
        }

    public void calificaciones(){
        int[] numeros = new int [10];
        int apr=0;
        int repr=0;
        for (int i=0; i<10;i++){
            System.out.println("Ingrese la calificacion");
            numeros[i]=entrada.nextInt();
          if (numeros[i]>6){
              apr ++;
            }
          else if (numeros[i]<6){
              repr ++;
            }
        }
      System.out.println("Alumnos reprobados : " + repr );
      System.out.println("Alumnos aprobados : "+ apr);
    }
    public void matriz(){
        int matrizA[][] = new int [3][3];
        int matrizB[][] = new int [3][3];
        int matrizS[][] = new int [3][3];

        System.out.println("Matriz A");
        for (int i = 0; i <= 2; i++){
            
            for (int j = 0; j <= 2; j++){
                System.out.print("Escribe el valor de [" + i + "] [" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Matriz B");
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                System.out.print("Escribe el valor de [" + i + "] [" + j + "]: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                 matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("Matriz resultante de la suma:");
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++) {
                System.out.println(matrizS[i][j]);
            }           
        }
    }
}