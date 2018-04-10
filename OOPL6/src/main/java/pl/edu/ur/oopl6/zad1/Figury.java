package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }
    /**
     * Metoda statyczna obliczająca kwadrat
     */
    public static double PoleKwadrat(double a){
        return a*a;
    }
    public static double ObwodKwadrat(double a){
        return 4*a;
    }
    
    /**
     * Metoda statyczna obliczająca prostokat
     */
    public static double PoleProstkat(double a,double b){
        return a*b;
    }
    public static double ObwodProstokat(double a, double b){
        return 2*a+2*b;
    }
    
    /**
     * Metoda statyczna obliczająca stozek
     */
    public static double PoleStozek(double r, double l){
        return Math.PI*r*(r+l);
    }
    public static double ObjetoscStozek(double r, double h){
        return (1/3)*Math.PI*r*r*h;
    }
    
    /**
     * Metoda statyczna obliczająca walec
     */
    public static double PoleWalec(double r, double h){
        return 2*Math.PI*Math.pow(r,2)+2*Math.PI*r*h;
    }
    public static double ObjestoscWalec(double r, double h){
        return Math.PI*r*r*h;
    }
}
