package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.HomePage;
//NoSuchElementException
public class TestMoreCases extends CommonAPI {
    HomePage homePage;
    String url = "https://www.alibaba.com/";
    //https://swisnl.github.io/jQuery-contextMenu/demo.html >> rightclick
    //   http://jqueryui.com/ >> drag and drop.

    @BeforeClass
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);

    }

    @AfterMethod
    public void recap() {
        driver.get(url);
    }

    @Test(priority = 22, enabled = false)
    public void signin_bymobille_number() throws InterruptedException {
        homePage.setSignin();
        homePage.setAccount();
        homePage.setPassword();
        homePage.setMobilenumber_signin();
        homePage.setMobilenumber();

    }

    // this method has Actions class to use mouse hover//
    @Test(priority = 23, enabled = false)
    public void click_catagories() throws InterruptedException {
        homePage.setCatagories();
        homePage.setMachinary_Fabricatoinservice();
    }

    @Test(priority = 24, enabled = false)
    public void Help_center() throws InterruptedException {
        homePage.setHelpcenter();

    }

    @Test(priority = 25, enabled = false)
    public void clik_on_alibaba_com() throws InterruptedException {
        homePage.setAboutalibaba_com();
        homePage.setMouseover1();
    }

    @Test(priority = 26,enabled = false)
    public void click_furniture() throws InterruptedException {
        homePage.setFurniture();
        homePage.setChildrenfurniture();
    }
    @Test(priority = 27,enabled = false)
    public void drag_drop_action() throws InterruptedException {
        homePage.setDrag_drop();
    }
    @Test(priority = 28,enabled = false)
    public void rightclick_usage() throws InterruptedException {
        homePage.setRightclick();
    }

    @Test
    public void service_membership_movetoelement() throws InterruptedException {
        homePage.setService_membership();
    }

}
