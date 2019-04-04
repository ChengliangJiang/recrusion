/**
 * 递归求最大公约数
 */
public class Gcd {
    //（m>n）m和n的最大公约数=n和m%n的最大公约数
    //(36 24)  (24 36%24)=(24 12)  (12 24%12) =(12 0)=12
    public int gcd(int m,int n){
        if(n==0){
            return m;
        }
        else
            return gcd(n,m%n);
    }
    public static void main(String[] args){
        Gcd gcd=new Gcd();
        int res=gcd.gcd(99,55);
        System.out.println(res);
    }
}
