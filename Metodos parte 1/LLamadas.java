import java.util.Scanner;
public class LLamadas{
    int numtel;
    int  duracion,credito;
    double credito2;
    public int getnumtel(){
        return numtel;
    }
    public void setnumtel(int numtel){
        this.numtel = numtel;
    }
    public int getcredito(){
        return credito;
    }
    public void setcredito(int credito){
        this.credito = credito;
    }
    public double getcredito2(){
        return credito2;
    }
    public void setcredito2(double credito2){
        this.credito2 = credito2;
    }
    public int getduracion(){
        return duracion;
    }
    public void setduracion(int duracion){
        this.duracion = duracion;
    }
    public void Nacionales(int credito, int duracion){
        credito2 = (credito) - (duracion*0.5);
        System.out.println("El credito restante es: "+credito2);
    }
    public void Internacionales(int credito, int duracion){
        credito2 = (credito) - (duracion*0.6);
        System.out.println("El credito restante es: "+credito2);
    }
    public void Celulares(int duracion, int credito){
        credito2 = (credito) - (duracion*0.2);
        System.out.println("El credito restante es: "+credito2);
    }
}