package pojo;

public class UserForm {
    private String uname;
    private String upass;
    private String reupass;

    @Override
    public String  toString() {
        return "UserForm{" +
                "uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", reupass='" + reupass + '\'' +
                '}';
    }

    public UserForm(String uname, String upass, String reupass) {
        this.uname = uname;
        this.upass = upass;
        this.reupass = reupass;
    }

    public UserForm() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getReupass() {
        return reupass;
    }

    public void setReupass(String reupass) {
        this.reupass = reupass;
    }
}
