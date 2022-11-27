public class Main{      //Main class
   
    public static void main(String[] args) {
        
        category c = new category();
        c.setName("action");
        

        Movie m = new Movie("Arrow", "the hero", 45, 200, 4);
        m.setCat(c);


        Thumbnail im =new Thumbnail("flower", 22, 10, "test.jpg");
        m.setImg(im);

        User u=new User("chamari", 44, 'f', 2);
        m.addUser(u);       // User details add to Movie.....
    

        Series s =new Series("The angel", "korean series", 30, 300, 5);
        s.setCat(c);

        Documentaries d =new Documentaries("abc", "english movie", 60, 600, 4) ;
        d.setCat(c);

        Actor a = new Actor("Heshara", 45, 'f', 1);
        Actor a2 = new Actor("Test", 34, 'm', 3);
        Actor p =new Actor("kamala", 22, 'f', 4);
        m.addActor(a);          //add actor details to movie
        m.addActor(a2);
        m.addActor(p);
            
       

        s.addActor(p);      //add Actor details to series
        s.addUser(u);       //add User details to series
    

        m.showDetails();        //show the details....

        s.showDetails();

        

       
    }
}
