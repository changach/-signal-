package sharon.matatu.project;

public class Auth {
    //log in of user
    String first_name;
    String last_name;
    int Phone_number;

    //Default Constructor
    public Auth() {
    }

    //Parameterized Constructor
    public Auth(String first_name, String last_name, int Phone_number){
        this.first_name = first_name;
        this.last_name = last_name;
        this.Phone_number = Phone_number;
    }
    //parameterized getters and setters


    public String getfirst_name() {
        return first_name;
    }

    public void setfirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getlast_name() {
        return last_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(int phone_number) {
        Phone_number = phone_number;
    }
}
