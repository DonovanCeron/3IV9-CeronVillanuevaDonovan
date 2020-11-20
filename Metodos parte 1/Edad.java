import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Edad{
 int dia,anos;
 String mes;
 public int getdia(){
     return dia;
    }
 public void setdia(int dia){
     this.dia=dia;
    }
    public String getmes(){
        return mes;
       }
    public void setmes(String mes){
        this.mes=mes;
    }
    public int getanos(){
        return anos;
       }
    public void setanos(int anos){
        this.anos=anos;
    }
public void calcula(int dia,String mes,int anos){
   
    String d=Integer.toString(dia);
    String a=Integer.toString(anos);
 
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate fechaNac = LocalDate.parse(d+"/"+mes+"/"+a, fmt);
    LocalDate ahora = LocalDate.now();

    Period periodo = Period.between(fechaNac, ahora);
    System.out.printf("Tu edad es: %s años, %s meses y %s dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());


}
} 
