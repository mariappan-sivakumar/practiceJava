public class Complex {
     int real;
     int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "Complex{" +
                 real +
                " + i(" + imaginary +
                ")}";
    }

    public static Complex add(Complex a, Complex b){
        int realAdd=a.real+b.real;
        int imaginaryAdd=a.imaginary+ b.imaginary;
        return new Complex(realAdd,imaginaryAdd);
    }
    public static Complex diff(Complex a, Complex b){
        int realDiff=a.real-b.real;
        int imaginaryDiff=a.imaginary-b.imaginary;
        return new Complex(realDiff,imaginaryDiff);
    }
    public static Complex mul(Complex a, Complex b){
        int realMul=(a.real* b.real)-(a.imaginary*b.imaginary);
        int imaginaryMul=(a.real*b.imaginary)+(a.imaginary*b.real);
        return new Complex(realMul,imaginaryMul);
    }
    public static Complex div(Complex a, Complex b){
        int denominator= (int) (Math.pow(b.real,2)+Math.pow(b.imaginary,2));
        int realDiv=(a.real*b.real)+(a.imaginary*b.imaginary);
        int imaginaryDiv=(a.imaginary*b.real)-(a.real*b.imaginary);
        return new Complex(realDiv/denominator,imaginaryDiv/denominator);
    }
}
