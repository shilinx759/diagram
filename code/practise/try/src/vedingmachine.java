public class vedingmachine {

    int price=80;
    int balance;
    int total;

    void showPompt(){
        System.out.println("Welcome");
    }
    void showBalance(){
        System.out.println(balance);
    }
    void insertMoneny(int amount){
        balance=balance+amount;
    }
    void getFood(){
        if(balance>=price){
            System.out.println("here you are");
            balance-=price;
            total+=price;
        }

    }
    vedingmachine(){//构造函数
        total=0;
    }
    vedingmachine(int price){//重载
        this();//调用上面那个构造函数，只能写在第一句
        this.price=price;
    }

    public static void main(String[] args) throws Exception{

        vedingmachine vm=new vedingmachine();
        vm.showPompt();
        vm.showBalance();
        vm.insertMoneny(100);
        vm.getFood();
        vm.showBalance();
        
   

    }
}
