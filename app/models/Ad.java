package models;

import play.*;
import play.db.jpa.*;
import play.data.validation.*;

import javax.persistence.*;
import java.util.*;



@Entity
public class Ad extends Model {
    
	@Required
	public int adId;
    
}