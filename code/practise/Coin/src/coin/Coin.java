package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {//一一对应的输出
    private HashMap<Integer,String> coinnames= new HashMap<Integer,String>();

      //列哈希表
      public Coin(){
        coinnames.put(1, "penney");
        coinnames.put(5, "wu");
        coinnames.put(10, "shi");
        coinnames.put(25, "ershiwu");
        coinnames.put(50, "wushi");
        coinnames.put(50,"wu");//输出的是这行
        System.out.println(coinnames.keySet().size());//可查看哈希表的大小
        System.out.println(coinnames);//可以直接解输出

        //遍历哈希表，用k去遍历哈希标的key值
        for(Integer k:coinnames.keySet()){//keyset函数里就是哈希表的所有key值
            String s=coinnames.get(k);
            System.out.println(s);
        }
    }

    public String getName(int amount){//得到输入的金额
        //判断表里有没有这个值
        if(coinnames.containsKey(amount)){
            return coinnames.get(amount);
        }
        else return "NO FOUND";
    }
    public static void main(String[] args) throws Exception {
        
        Scanner in=new Scanner(System.in);
        int amount=in.nextInt();//输入
        Coin coin=new Coin();//制造coin类对象
        String name= coin.getName(amount);


        System.out.println(name);
    }
}
