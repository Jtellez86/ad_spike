package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

import java.sql.Connection;

public class Application extends Controller {

    public static void index() {
        render();
    }

/**	public static void list() {
        List<Ad> ads = Ad.find("order by id").fetch();
        render(ads);
    }

	public static void form(Long id) {
        if(id == null) {
            render();
        }
        Ad ad = Contact.findById(id);
        render(ad);

     --goes in index.html
	#{list ads, as:'ads'}
    <tr class="ad" adId="${ad.adId}">
		<td id="name-${ad.adId}">${ad.adId}</td>
	</tr>
    #{/list}
    }*/
}