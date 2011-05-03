package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import java.sql.*;

import javax.persistence.*;

public class Application extends Controller {
	
	public static String imageName;

    public static void index() {

        render();
    }




	public static void logOptOut() {
	
	String adName = Application.imageName;
	new Ad(adName).save();


	List<Ad> ads = Ad.all().fetch();    
	render(ads);
    }

	public static void optOut(String imageNameIn){
	Application.imageName = imageNameIn;
	render();
	}
}
