package CDandDVD;

public class Veidogame extends Item{
    private int numofPlayer;

    public Veidogame(String title, int numofTracks, int playTime, String commment,int numofPlayer) {
        super(title, numofTracks, playTime, commment);
        this.numofPlayer = numofPlayer;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Vediogame");
        super.print();
    }

    

 
    
}
