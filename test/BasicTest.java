import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

      @Test
    public void testThatAdInfoIsLogged() {
   
	new OptedOutAd("ad1").save();

	List<OptedOutAd> ads = OptedOutAd.all().fetch();
	assertEquals(ads.get(ads.size() - 1).getAdId(), "ad1");
	
    }

}
