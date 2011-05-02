package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import java.sql.*;

import javax.persistence.*;

public class Application extends Controller {

	

    public static void index() {
        render();
    }




public static void list(String imageNameIn) {
	//String id = params.get("imageNameIn"); 


	/*Connection conn = DB.getConnection();
	conn.createStatement().execute("insert into logs (adId) values ('this works!')");*/

       

	Ad ad = new Ad(imageNameIn);
	ad.adId = imageNameIn;	
	if(ad.adId != null)	
	ad.save();
	
	List<Ad> ads = Ad.all().fetch();    
	render(ads);
    }
}
