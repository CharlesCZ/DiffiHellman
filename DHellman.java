import java.math.BigInteger;

import static java.lang.Math.pow;

public class DHellman {

    private int n,g;
 private  int x,y;

    public int getN() {
        return n;
    }

    public void setNandG(int n,int g) {
        this.n = n;
        this.g=g;

        if(g>n || g<=1 || n<=1)
            throw new IllegalArgumentException("niespelniaja zalozen");
    }

    public int getG() {
        return g;
    }

    public BigInteger getBigX() {
        BigInteger gDecimal=new BigInteger(Integer.toString(g));


        
        return gDecimal.modPow(new BigInteger(Long.toString(x)),new BigInteger(Long.toString(n)));
    }

    public void setX(int x) {
        this.x = x;
    }

    public BigInteger getBigY() {
        BigInteger gDecimal=new BigInteger(Integer.toString(g));



        return gDecimal.modPow(new BigInteger(Long.toString(y)),new BigInteger(Long.toString(n)));

    }

    public void setY(int y) {
        this.y = y;
    }

    public int getk(){

        return  getBigY().modPow(new BigInteger(Long.toString(x)),new BigInteger(Long.toString(n))).intValue();
    }

    public int getkprime(){

        return getBigX().modPow(new BigInteger(Long.toString(y)),new BigInteger(Long.toString(n))).intValue();
    }

    boolean pierwiastekPierwotny(int pierwiastek, int n){
       int[] reszty=new int[(int)n];

        for(int i=1;i<n;++i)
            ++reszty[ (int)(pow(pierwiastek,i)%n)];

    for(int i=1;i<n;++i)
        if(reszty[i]!=1)
            return false;


        return true;
}
}
