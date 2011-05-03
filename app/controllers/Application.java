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
	new Ad(imageNameIn).save();

	List<Ad> ads = Ad.all().fetch();    
	render(ads);
    }
}
