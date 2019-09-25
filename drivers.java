public class drivers {
    private String firstName;
    private String lastName;
    private int age;
    private String interests;
    public driver (String fname, String lname, int age, String qualities){
        this.lastName = lname;
        this.firstName = fname;
        this.age = age;
        this.interests = qualities;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public int getAge(){
        return age;
    }
    public String getInterest(){
        return interests;
    }
}