public class Thumbnail {

    private String name ;
    private String url;
    private int height,width ;



    public Thumbnail(String name,int h ,int w,String url) {
        this.url=url;
        this.name =name;
        this.height=h;
        this.width=w ;
    }


    //getters and setters....
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

   
    public int getWidth() {
        return width;
    }

    public String getUrl() {
        return url;
    }

    public void setname(String name) {
        this.name = name ;
    }
    public void setHeight(int h) {
        this.height=h ;
    }

    public void setWidth(int w) {
        this.width=w ;
    }

    
    public void setURL(String url) {
        this.url=url ;
    }

    
}
