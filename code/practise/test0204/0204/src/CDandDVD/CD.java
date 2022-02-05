package CDandDVD;

public class CD extends Item{
    //private String title;
    private String artist;
    // private int numofTracks;
    // private int playTime;
    // private boolean gotIt;
    // private String commment;


    public CD(String title, String artist, int numofTracks, int playTime, String commment) {
        super(title, numofTracks, playTime, commment);
    //    this.title = title;
        this.artist = artist;
        // this.numofTracks = numofTracks;
        // this.playTime = playTime;
        // this.commment = commment;
    }//快速构造器 空白处右键-》source action-》general constructor

 
    public void print() {
        System.out.print("CD");
        super.print();
        System.out.print(":"+artist);
    }

    


    @Override
    public boolean equals(Object obj) {
        CD cc=(CD)obj;
        return artist.equals(cc.artist);
    }


    public static void main(String[] args){
        CD cd=new CD("12", "12", 2, 2, "commment");
        CD cd1=new CD("12", "12", 2, 2, "commment");
        System.out.println(cd.equals(cd1));
    }

    

}
