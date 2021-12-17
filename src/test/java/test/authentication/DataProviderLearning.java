package test.authentication;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLearning {
    @Test(dataProvider = "wrongCredsData")
    public void loginWithIncorrectCreds(String username, String password){
        System.out.println(username);
        System.out.println(password);
        System.out.println("===========\n");
    }

    @DataProvider
    public Object[][] wrongCresData(){

    }
}
