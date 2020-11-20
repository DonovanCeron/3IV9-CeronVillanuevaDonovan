import java.util.Scanner;
 public class Rectangulo{
    float h,b;
    public float geth(){
        return h;
    }
    public void seth(float h){
        this.h = h;
    }
    public float getb(){
        return b;
    }
    public void setb(float b){
        this.b = b;
    }
    public void Area(float h, float b){
        double area;
        area = b * h;
    System.out.println("El area del rectangulo es de: "+area);
    }
    public void Perimetro(float h, float b){
        double peri; 
        peri = b + b + h + h;
        System.out.println("El perimetro del rectangulo es de: "+peri);
    }
}