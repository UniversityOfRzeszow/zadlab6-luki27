package pl.edu.ur.oopl6.zad3;

/**
 *
 * @author Luki
 */
public class Complex {
    private final double reZ;
    private final double imZ;

    public Complex(double real, double imag){
        reZ = real;
        imZ = imag;
    }

    @Override
    public String toString(){
        if (imZ == 0){
            return reZ + "";
        }
        if (reZ == 0){
            return imZ + "i";
        }
        if (imZ < 0){
            return reZ + " - " + (-imZ) + "i";
        }
        return reZ + " + " + imZ + "i";
    }

    public double reZ(){
        return reZ;
    }

    public double imZ(){
        return imZ;
    }

    public double abs(){
        return Math.hypot(reZ, imZ);
    }

    public double phase(){
        return Math.atan2(imZ, reZ);
    }

    public Complex plus(Complex b){
        Complex a = this;
        double real = a.reZ + b.reZ;
        double imag = a.imZ + b.imZ;
        return new Complex(real, imag);
    }

    public Complex minus(Complex b){
        Complex a = this;
        double real = a.reZ - b.reZ;
        double imag = a.imZ - b.imZ;
        return new Complex(real, imag);
    }
    
    public Complex times(Complex b){
        Complex a = this;
        double real = a.reZ * b.reZ - a.imZ * b.imZ;
        double imag = a.reZ * b.imZ + a.imZ * b.reZ;
        return new Complex(real, imag);
    }

    public Complex conjugate(){
        return new Complex(reZ, -imZ);
    }

    public Complex scale(double alpha){
        return new Complex(alpha * reZ, alpha * imZ);
    }

    public Complex reciprocal(){
        double scale = reZ * reZ + imZ * imZ;
        return new Complex(reZ / scale, -imZ / scale);
    }

    public Complex divides(Complex b){
        Complex a = this;
        return a.times(b.reciprocal());
    }

    public Complex exp(){
        return new Complex(Math.exp(reZ) * Math.cos(imZ), Math.exp(reZ) * Math.sin(imZ));
    }

    public Complex cos(){
        return new Complex(Math.cos(reZ) * Math.cosh(imZ), -Math.sin(reZ) * Math.sinh(imZ));
    }

    public Complex sin(){
        return new Complex(Math.sin(reZ) * Math.cosh(imZ), Math.cos(reZ) * Math.sinh(imZ));
    }

    public Complex tan(){
        return sin().divides(cos());
    }

    public static Complex plus(Complex a, Complex b){
        double real = a.reZ + b.reZ;
        double imag = a.imZ + b.imZ;
        Complex sum = new Complex(real, imag);
        return sum;
    }

    public static void main(String[] args){
        Complex a = new Complex(2.0, 4.0);
        Complex b = new Complex(1.0, 2.0);
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Modul liczby zespolonej = " + a.abs());
        System.out.println("Liczba sprzezona do liczby zespolonej = " + a.conjugate());
        System.out.println("Liczba zespolona algebraiczna w postaci wykladnicznej = " + a.exp());
        System.out.println("Liczba zespolona wykladnicza w postaci algebraicznej = " + a);
        System.out.println("Dodawanie = " + b.plus(a));
        System.out.println("Odejmowanie = " + a.minus(b));
        System.out.println("Mnozenie = " + a.times(b));
        System.out.println("Dzielenie = " + a.divides(b));
        System.out.println("Liczba zespolona w postaci algebraicznego = " + a);
        System.out.println("Liczba zespolona w postaci wykladnicznej = " + a.exp());
        System.out.println("Liczba zespolona w postaci trygonometryczna = " + a.tan());
        System.out.println("tanges liczby a = " + a.tan());
    }
    
}
