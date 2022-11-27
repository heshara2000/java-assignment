

public class Actor extends Person{     //Actor is sub class of Person class

    protected int rating ;
    protected Video content ;

    
    public int getRating() {
        return rating;
    }

    public Video getContent() {
        return content;
    }


    public Actor(String n, int age, char s,int r) {
        super(n, age, s);        //call the super class method (to Person class)
        this.setRating(r);
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
        this.content=c;
    }




    //override the Persons class to getdetails
    @Override
    public String toString() {         //returns the value of  string object
        return String.format("%s",this.name);
    }

    
    
}
