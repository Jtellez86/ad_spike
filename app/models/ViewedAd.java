package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

import java.sql.*;

import org.apache.commons.lang.time.DateFormatUtils;
 
@Entity
public class ViewedAd extends Model {
 
    public String adId;
    public String timeViewed;
    
    public ViewedAd(String adId) {
        this.adId = adId;


	//Another way to format the time
	//Timestamp time = new Timestamp(System.currentTimeMillis());
	//this.timeViewed = time.toString());
        
this.timeViewed = DateFormatUtils.format(System.currentTimeMillis(),"MM dd yy HH:mm");
	
    }
}
