package entity;

import lombok.Data;

@Data
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


}
