/**
 * 汉诺塔递归求解问题
 */
public class Hanota {
    public void hanota(int n,char from,char to,char mid){
        //递归终止条件
        if(n==1){
            move(1,from,to);
        }
        else{
            hanota(n-1,from,mid,to);//n-1先移到中间柱子
            move(n,from,to);//n移到目标柱子
            hanota(n-1,mid,from,to);//再将n-1移过来
        }

    }

    private void move(int i, char from, char to) {
        System.out.println("第"+i+" 个从"+from+"到"+to);
    }
    public static void main(String[] args){
        Hanota hanota=new Hanota();
        hanota.hanota(3,'A','C','B');
    }
}
