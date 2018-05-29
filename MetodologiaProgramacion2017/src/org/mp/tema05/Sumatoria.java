package org.mp.tema05;


public class Sumatoria {

    
    public static long sumaRec(int n)
    {
        if (n == 1)
            return 1;
        else 
            return sumaRec(n - 1) + n;
    }
    
    public static  long sumaGauss (long valor) {
        return (valor * (valor +1))/2;
    }
    
    public static  long sumaIter (long valor) {
      
        long suma=0;
        for (int i = 1; i <= valor; i++) {
            suma +=i;
        }
        return suma;
    }
}
