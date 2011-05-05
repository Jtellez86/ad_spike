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

	public static void logOptOut(String imageNameIn) {
	System.out.println(imageNameIn);
	Application.imageName = imageNameIn;

	new OptedOutAd(imageNameIn).save();


	List<OptedOutAd> ads = OptedOutAd.all().fetch();    
	render(ads);
    	}

	public static void optOut(String imageNameIn){
	Application.imageName = imageNameIn;
	render();
	}

	public static void displayAdsViewedLog(){
	List<ViewedAd> viewedAds = ViewedAd.all().fetch();    
	render(viewedAds);
	}
}
