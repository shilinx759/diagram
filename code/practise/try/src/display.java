public class display {
    private int value;
    private int limit;

    public display(int limit){
        this.limit=limit;
    }
    
    public void inCrease(){
        value++;
        if(value==limit){
            value=0;
        }
    }

    public int getValue(){
        return value;
    }
    public static void main(String[] args){
       
        display hour=new display(24);
        display minute=new display(60);
      
        System.out.println(hour+":"+minute);

    }
}
