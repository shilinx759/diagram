package CDandDVD;

public class Item {
    private String title;
  
    private int numofTracks;
    private int playTime;
    private boolean gotIt;
    private String commment;

    public Item(String title, int numofTracks, int playTime, String commment) {
        super();
        this.title = title;
        this.numofTracks = numofTracks;
        this.playTime = playTime;
        this.commment = commment;
    }
    public void print(){
        System.out.print(title);
    }
    
}
