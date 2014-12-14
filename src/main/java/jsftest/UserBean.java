package jsftest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Created by omid on 2014-12-14.
 */
@ManagedBean(name = "user")
@RequestScoped
public class UserBean implements Serializable {
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
