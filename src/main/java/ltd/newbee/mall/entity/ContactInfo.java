package ltd.newbee.mall.entity;

import java.util.Date;

/**
 * @ClassName: ContactInfo
 * @Description: 联系我们的信息
 * @author: 59628
 * @date: 2022/5/18 19:39
 */

public class ContactInfo {
    private String name;

    private String email;

    private String message;

    private Date Create_date;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreate_date() {
        return Create_date;
    }

    public void setCreate_date(Date create_date) {
        Create_date = create_date;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", Create_date=" + Create_date +
                '}';
    }
}
