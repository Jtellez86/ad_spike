package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Ad extends Model {
 
    public String adId;
    
    public Ad(String adId) {
        this.adId = adId;
    }
}
