import java.util.Scanner;

class Pokemon{

    public static void main(String[] args){
       
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        String op="";
        int Ascuas, Llamarada, Latigo_S, Rayo_S, Salpicar, Hidrobomba;
        int PS;
        do{
            System.out.println("3IV9_Ceron_Villanueva_Donovan");
            System.out.println("Escoja una de las siguientes opciones");
            System.out.println("1.-Info. Charmander");
            System.out.println("2.-Info. Bulbasaur");
            System.out.println("3.-Info. Squartl");
            System.out.println("4.-Batalla Pokemon");
            System.out.println("5.-Salir");
            opcion = System.console().readLine();
            switch (opcion) {
                case "1":
                     System.out.print("Nº 004");
                     System.out.print("Charmander");
                     System.out.println("PS.    9");
                     System.out.println("Atq.   4");
                     System.out.println("Def.   2");
                     System.out.print("Ascuas");
                     System.out.println("Llamarada");
                    break;
                case "2":
                     System.out.print("Nº001");
                     System.out.println("Bulbasaur");
                     System.out.println("PS.    9");
                     System.out.println("Atq.   3");
                     System.out.println("Def.   2");
                     System.out.println("Latigo sepa");
                     System.out.println("Rayo Solar");
                    break;
                case "3":
                     System.out.print("Nº 007");
                     System.out.print("Squirtle");
                     System.out.println("PS.    9");
                     System.out.println("Atq.   4");
                     System.out.println("Def.   5");
                     System.out.print("Salpicar");
                     System.out.println("Hidrobomba");
                    break;
                case "4":
                     System.out.println("Seleccione su Pokemon");
                     System.out.println("1.-Charmander");
                     System.out.println("2.-Bulbasaur");
                     System.out.println("3.-Squartl");
                     op = System.console().readLine();
                     switch (op) {
                         case "1":
                             break;
                          case "2":
                             break;
                          case "3":
                             break;
                         default:
                             break;
                     }
                    break;
                default:
                     System.out.println("Aqui no hay nada.")
                 break;

            }
        }while(!opcion.equalsIgnoreCase("5"));
    }
}