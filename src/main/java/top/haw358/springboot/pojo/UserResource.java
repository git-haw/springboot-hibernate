package top.haw358.springboot.pojo;

import org.springframework.hateoas.ResourceSupport;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by haw on 17-9-1.
 */
@XmlRootElement
public class UserResource extends ResourceSupport {

    private String username;
    private String password;
    private Date createdDate;
    private Date lastAccessed;
    private Boolean isActive = Boolean.TRUE;

    public UserResource(){}

    public UserResource(String username, String password, Date createdDate, Date lastAccessed, Boolean isActive) {
        this.username = username;
        this.password = password;
        this.createdDate = createdDate;
        this.lastAccessed = lastAccessed;
        this.isActive = isActive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(Date lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
