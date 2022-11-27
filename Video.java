import java.util.ArrayList;         //import the ArrayList...
import java.util.List;


//video is implements to the ControlVideo Interface


public abstract class Video implements ControlVideo {
    
    protected String name,description ;
    protected Thumbnail img ;
    protected int duration ;
    protected int capacity ;
    protected List<Actor> list;
    protected List<User> lst ;
    

    public Video(String n, String desc, int du, int capa) {          //java constructors....
        this.name = n;
        this.description = desc;
        this.duration = du;
        this.capacity = capa;
        list = new ArrayList<>();  
        

    }
    
    //getters and setters...
    public List<Actor> getList() {    //getter method
        return list;
    }

    public List<User>getLst() {
        return lst ;
    }

    public void AddActor(Actor b){
        this.list.add(b);

    }

    public void addUser(User u) {
        this.lst.add(u) ;
    }

    public void setImgThumbnail(Thumbnail img) {
        this.img = img;
    }
    
    @Override
    public void play() {


    }
    @Override
    public void pause() {


    }
    @Override
    public void stop() {
    
    }

    


}