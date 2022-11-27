import java.util.ArrayList;      //import the ArrayList class...
import java.util.List;

public class Movie extends  Video{         //the movie class inherit the video class


    private int rating;                    //these private variables accessible for the Movie class
    private category cat;
    private List<Actor> actorList;       
    private List<User>userList ;
    private Thumbnail img ;

    public Movie(String n, String desc, int du, int capa, int r) {     //Movie class is the sub class of the Video class.Video class is the super class
        super(n, desc, du, capa);
        this.setRating(r);
        this.actorList = new ArrayList<>();
        this.userList=new ArrayList<>();

    }

    public void setUserList(List<User> userList) {
        this.userList = userList ;
    }

    public List<User> getUserList() {
        return userList;
    }

    
    
    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    public void addActor(Actor a) {
        this.actorList.add(a);
    }

    public void addUser(User u) {
        this.userList.add(u);
    }

    public String getActors() {
        return this.actorList.toString();
    }

    public String getUsers() {
        return this.userList.toString();
    }



    
    public void setname(String n){
        this.name=n;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        if (r >= 1 && r <= 5) {         //chack the rates
            this.rating = r;
        } else {
            System.out.println("not valid....");
        }
    }
    
    public category getCat() {
        return cat;
    }

    public void setCat(category cat) {       //set categories...
        this.cat = cat;
    }

    
    public Thumbnail getImg() {
        return img;
    }

    public void setImg(Thumbnail img) {
        this.img = img;
    }

    

    public void showDetails() {      //show all the details
        System.out.println("Name:- "+this.name+"\nRating:- "+this.rating+"\nActors:- "+this.actorList.toString()+
        "\nUser:-"+this.userList.toString()+"\nCategory:- "+this.getCat());
    }

    


}