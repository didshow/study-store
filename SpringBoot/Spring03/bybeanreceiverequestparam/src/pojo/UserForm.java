package pojo;

/**
 * Created by wangchao on 2021/11/25.
 */
public class UserForm {
    private String uname; //与请求参数名称相同
    private String upass;//与请求参数名称相同
    private String reupass;//与请求参数名称相同

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
