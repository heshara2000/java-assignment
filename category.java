

public class category {

   private String name;
   private String[] cats;      //get variable name as 'cats' to get catergories


   public category() {
      this.cats = new String[] { "ACTION", "FUNNY", "AVENTURE", "COMEDY", "HORROR", "ROMANCE", "THRILLER" };
   }
   
   public String getName() {
      return name;
   }

   public void setName(String n) {

      for (String cat : this.cats) {

         if (n.toUpperCase().equals(cat)) {      // lowecase letters convert to the uppercase letters and compare two strings
            this.name = n;
            return;
         } else {
            this.name = null;
         }
      }

   }

   @Override
   public String toString() {        //convert to the string...
     
      return this.name;
   }

}
