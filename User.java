import java.util.ArrayList;
import java.util.List;

public class User extends Person {     //user is sub class of Person

    protected int rating;
    private List<Video> contents;

    public int getRating() {
        return rating;
    }


    public User (String n,int age ,char s,int r){
        super(n,age,s) ;
        this.setRating(r);
        this.contents = new ArrayList<>();
    }

    public void setRating(int r) {
        if (r >=1 && r<=5) {
            this.rating=r ;
        }
        else {
            System.out.println("not valid....");
        }
    }

    public void setVideoContent(Video c) {
        this.contents.add(c);
    }


    @Override
    public String toString() {         //returns the value of  string object
        return String.format("%s",this.name);
    }






}