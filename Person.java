
public abstract class Person {      //Person is the abstract class

    protected String name ;      // User and Actor are sub classes of the Person class with protected attributes...
    protected int age ;
    protected char gender ;
    

    public Person(String n,int age ,char s ) {
        this.name = n;
        this.setAge(age);
        this.setGender(s);
        
    }

    //getters and setters..

    public void setname(String n) {
        this.name = n;
    }

    public void setAge (int age) {
        if (age >=1 && age<=100) {
            this.age=age ;

        }
        else {
            System.out.println("not valid!,,,,,,");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char s) {              // check the gender Femal or Male
        if (s=='F' || s=='M' || s=='f' || s=='m'){      //check the character s is capital or simple
        }
        else{
            System.out.println("not valid!....");
        }
    }


    
}
