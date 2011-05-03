package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

import java.sql.*;

import org.apache.commons.lang.time.DateFormatUtils;
 
@Entity
public class OptedOutAd extends Model {
 
    public String adId;
    public String timeOptedOut;
    
    public OptedOutAd(String adId) {
        this.adId = adId;


	//Another way to format the time
	//Timestamp time = new Timestamp(System.currentTimeMillis());
	//this.timeOptedOut = time.toString());
        
this.timeOptedOut = DateFormatUtils.format(System.currentTimeMillis(),"MM dd yy HH:mm");
	
    }
}
