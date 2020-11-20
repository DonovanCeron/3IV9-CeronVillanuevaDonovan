import java.util.Scanner;
 public class Cuadrado{
    float b;
    public float getb(){
        return b;
    }
    public void setb(float b){
        this.b = b;
    }
    public void Area(float b){
        double area;
        area = b * b;
    System.out.println("El area del cuadrado es de: "+area);
    }
    public void Perimetro(float b){
        double peri; 
        peri = b + b + b + b;
        System.out.println("El perimetro del cuadrado es de: "+peri);
    }
}