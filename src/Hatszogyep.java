import java.util.Scanner;

public class Hatszogyep {
    public Hatszogyep() {}
    public void StartHatszogyep(){
        kiir(bekerData());
    }
    private void kiir(double result){
        System.out.println(result);
    }
    private double bekerData(){
        String oldal1Str=beker("Telek oldalának hossza (amelyiken a ház van): ");
        double oldal1=Double.parseDouble(oldal1Str);
        String oldal2Str=beker("Másik telek oldalának hossza: ");
        double oldal2=Double.parseDouble(oldal2Str);
        return this.szamitTerulet(oldal1,oldal2);
    }
    private String beker(String msg){
        Scanner scanner=new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
    public double szamitTerulet(double oldal1,double oldal2){
        double terulet=((3.0/2.0)*Math.pow(oldal1,2)*Math.pow(3, 1.0/2))/2+((3.0/2.0)*Math.pow(oldal2,2)*Math.pow(3, 1.0/2));
        return terulet;
    }
    public boolean checkInput(String input){
        if(input.matches("[0-9.]*")){
            return true;
        }else{
            return false;
        }
    }
}
