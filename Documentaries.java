
public class Documentaries extends Video {      //inherit from Video class....
    private int rating ;
    private category cat;
    private Thumbnail img ;



    // the constructors....
    public Documentaries(String n, String desc, int du, int capa, int r) {     //Documentaries class is the sub class of the Video class.Video class is the super class
        super(n, desc, du, capa);
        this.setRating(r);
    }


    public int getRating() {
        return rating;
    }


    public category getCat() {
        return cat;
    }


    public void setCat(category cat) {
        this.cat = cat;
    }


    public Thumbnail getImg() {
        return img;
    }


    public void setImg(Thumbnail img) {
        this.img = img;
    }


    public void setRating(int r) {
        if (r >= 1 && r <= 5) {         //chack the rates
            this.rating = r;
        } else {
            System.out.println("not valid....");
        }
    }




    public void showDetails() {      //show all the details of the Documentaries.....
        System.out.println("Name:- "+this.name+"\nRating:- "+this.rating+"\nActors:- "+this.list.toString()+
        "\nUser:-"+this.lst.toString()+"\nCategory:- "+this.getCat());
    }







}
