package Integration;

import java.awt.AWTException;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.RecentCont;
import Resources.Base;
import Sendkudos.Maincondition;

public class Recent_Contacts1 extends Base {
    
        @Test(dataProvider="logindata")
        public void sk(String username,String password) throws IOException, AWTException, InterruptedException {
        	Maincondition m=new Maincondition();
    		m.precond(username, password);
    		
            Thread.sleep(1000);
            RecentCont rc=new RecentCont(m.driver);
            Thread.sleep(1000);
            rc.RCKudosSearch().click();
            Thread.sleep(1000);
            rc.kudostype("Exceptional Work");
//            String arr[]= {"Exceptional Work","Excellent Team Work","Innovative Thinker","Good Client Relations","Quality Hero","Quick Learner","Hard Worker","Team player"};
//            for(int i=0;i<arr.length;i++) {
//                rc.kudostype(arr[i]);    
//                Thread.sleep(1000);
//                
//            }
//        
            rc.Comments().sendKeys("Good Work");
            rc.SendButton().click();
            m.driver.close();
}
        @DataProvider
         public Object[][] logindata() {
             Object[][]data =new Object[1][2];
                
                data[0][0]="seema.Chikkammanavar@qualitestgroup.com";
                data[0][1]="P@ssw0rd";
                return data;
         }
}