package CDandDVD;

import java.security.Principal;
import java.util.ArrayList;

public class Datebase {
    // private ArrayList<CD> listCD=new ArrayList<CD>();//listCD是CD类型的一个对象容器
    // private ArrayList<DVD> listDVD=new ArrayList<DVD>();
        private ArrayList<Item> listItem =new ArrayList<Item>();

    public void add(Item item){//cd也是一个CD类的临时对象，调用这个函数时的输入存入到
        //cd这个对象中，再一个一个传给对象容器listCD中储存起来
        listItem.add(item);
    }
    // public void add(DVD dvd){//cd也是一个CD类的临时对象，调用这个函数时的输入存入到
    //     //cd这个对象中，再一个一个传给对象容器listCD中储存起来
    //     listDVD.add(dvd);
    // }


    public void list(){
        // for(CD cd:listCD){//创建了一个CD类的一个临时对象cd，
        //     //用这个cd去遍历对象容器listCD里的所有对象
        //     cd.print();
        // }
        for(Item item:listItem){
            item.print();
        }
    }
    public static void main(String[] args) throws Exception {
        Datebase db=new Datebase();
        Datebase db2=new Datebase();
        db.add(new CD("123", "abc", 4, 60, "..."));//因为add的参数要CD类
        db.add(new CD("456","def",5,70,"..."));
        db.list();
        db2.add(new DVD("123","sdf",4,5,"qwe"));
        db2.add(new DVD("789","ssdf",4,5,"kjl"));
        db2.list();
    }
}
