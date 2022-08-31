package maths;

import java.security.spec.RSAOtherPrimeInfo;

public class MathsUtility {
    public int bSquare(int a,int b){
        return (a+b)*(a-b);

    }
    public int wholeSquare(int a,int b){
        return (a*a)+(2*a*b)+(b*b);
    }
    public int plusSquare(int a, int b){
        return ((a+b)*(a+b)-(2*a*b));
    }
    public int AMinusBwholeSquare(int a, int b){
        return ((a*a)-(2*a*b)+(b*b));
    }
    public int APlusBPlusCwholeSquare(int a, int b,int c){
        return ((a*a)+(b*b)+(c*c)+(2*a*b)+(2*b*c)+(2*c*a));
    }
    public int AMinusBMinusCwholeSquare(int a, int b,int c){
        return ((a*a)+(b*b)+(c*c)-(2*a*b)+(2*b*c)-(2*c*a));
    }

    public int APlusBCube(int a, int b){
        return ((a*a*a)+(3*(a*a)*b)+(3*a*(b*b))+(b*b));
    }
    public int AMinusBCube(int a, int b){
        return ((a*a*a)-(3*(a*a)*b)+(3*a*(b*b))-(b*b));
    }

    public static void main(String[] args) {
        MathsUtility ms=new MathsUtility();
        System.out.println(ms.bSquare(5,6));
        System.out.println(ms.wholeSquare(5,6));
        System.out.println(ms.plusSquare(5,6));
        System.out.println(ms.AMinusBwholeSquare(5,6));
        System.out.println(ms.APlusBPlusCwholeSquare(5,6, 9));
        System.out.println(ms.AMinusBMinusCwholeSquare(5,6,9));
        System.out.println(ms.APlusBCube(5,6));
        System.out.println(ms.AMinusBCube(5,6));
    }

}
