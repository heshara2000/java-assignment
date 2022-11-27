import java.util.ArrayList;
import java.util.List;

public class Series extends  Video{

        private int rating ;
        private List<Actor> actorList ;
        private List<User> userList ;
        private category cat;
        private Thumbnail img ;

        public Series(String n, String desc, int du, int capa, int r) {
            super(n, desc, du, capa);
            this.setRating(r);
            this.actorList=new ArrayList<>() ;
            this.userList=new ArrayList<>() ;
        }

        public void addActor(Actor a) {
            this.actorList.add(a) ;

        }

        public void addUser (User u) {
            this.userList.add(u) ;
        }


        //getters and setters....
        public String getActors() {
            return this.actorList.toString() ;
        }


        public String getUsers() {
            return this.userList.toString() ;
        }


        public category getCat() {
            return cat;
        }

        public void setName(String n){
            this.name=n;
        }
    
        public int getRating() {
            return rating;
        }
        public void setRating(int r){
            if(r>=1 && r<=5){
                this.rating=r;
            }
            else{
                System.out.println("not valid....");
            }
        }


        public void setCat(category cat) {
            this.cat=cat ;
        }


        

        public Thumbnail getImg() {
            return img;
        }

        public void setImg(Thumbnail img) {
            this.img = img;
        }

        public void showDetails(){
            System.out.println("Name :-"+this.name+"\nRate:-"+this.rating+"\ncategory type:-"+this.cat+"\nActor:-"+this.actorList.toString()+
            "\nUser :-"+this.userList.toString()+
            "\nDuration in min.:-" +this.duration +"\ncapacity:-"+this.capacity +"MB"+"\nDescription :-"+this.description);
        }
        





    
        @Override
    
        public void play(){
            System.out.println("video is playing....");
        }
    
        @Override
        public void pause(){
            System.out.println("video is pause....");
        }
    
        @Override
        public void stop(){
            System.out.println("video is stop....");
        }

  
}
