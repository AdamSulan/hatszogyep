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
        String oldalStr=beker("Telek oldalának hossza: ");
        double oldal=Double.parseDouble(oldalStr);
        return this.szamitTerulet(oldal);
    }
    private String beker(String msg){
        Scanner scanner=new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
    public double szamitTerulet(double oldal){
        double terulet=((3.0/2.0)*(3.0/2.0)*Math.pow(oldal,2)*Math.pow(3, 1.0/2));
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
