import java.util.Scanner;
 public class Triangulo{
    float h,b,b2,b3;
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
    public float getb2(){
        return b2;
    }
    public void setb2(float b2){
        this.b2 = b2;
    }
    public float getb3(){
        return b3;
    }
    public void setb3(float b3){
        this.b3 = b3;
    }
    public void Area(float h, float b){
        double area;
        area = b * h / 2;
    System.out.println("El area del triangulo es de: "+area);
    }
    public void Perimetro(float b2, float b, float b3){
        double peri; 
        peri = b + b2 + b3;
        System.out.println("El perimetro del triangulo es de: "+peri);
    }
}