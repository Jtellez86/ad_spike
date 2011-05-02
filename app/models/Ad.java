package models;

import play.*;
import play.db.jpa.*;
import play.data.validation.*;

import javax.persistence.*;
import java.util.*;



@Entity
@Table(name = "logs")
public class Ad extends Model {
    
	@Required
	public String adId;
	
	public Ad(String imageName){		
		this.adId = imageName;
	}


	@Column(name = "adId")
    	public String getadId(){
		return adId;
	}

	
	public void setAdId(String adID){
		this.adId = adId;
	}
}
