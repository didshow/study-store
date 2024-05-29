package entity;

public class User {
    private int uid;
    private String uname;
    private int uage;
    private String usex;

    public User(int uid) {
        this.uid = uid;
    }

    public User(int uid, String uname, int uage, String usex) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
        this.usex = usex;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                ", usex='" + usex + '\'' +
                '}';
    }
}
