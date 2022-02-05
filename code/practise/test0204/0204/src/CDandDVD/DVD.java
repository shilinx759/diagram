package CDandDVD;

public class DVD extends Item{
   // private String title;

    private String director;
    // private int numofTracks;
    // private int playTime;
    // private boolean gotIt;
    // private String commment;

    
    public DVD(String title, String director, int numofTracks, int playTime, String commment) {
        super(title, numofTracks, playTime, commment);
      //  this.title = title;
        this.director = director;
        // this.numofTracks = numofTracks;
        // this.playTime = playTime;
        // this.commment = commment;
    }
    public void print() {
        System.out.print("DVD");
        super.print();
        System.out.print(":"+director);
    }
}
