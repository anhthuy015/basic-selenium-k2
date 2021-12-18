package test.authentication;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.data.DataObjectBuilder;

public class DataProviderLearning {
    @Test(dataProvider = "wrongCredsData")
    public void loginWithIncorrectCreds(CredsData credsData){
        System.out.println(credsData.getUsername());
        System.out.println(credsData.getPassword());
        System.out.println("===========\n");
    }

    @DataProvider
    public CredsData[] wrongCredsData(){
        String jsonDataFileLocation = "/src/test/resources/Test-data/authentication/LoginCreds.json";
        return DataObjectBuilder.buildCredObject(jsonDataFileLocation);
        }

    @DataProvider
    public Object[][] wrongCredsDatak(){
        return new Object[][]{
                { "Cedric", "password_1" },
                { "Anne", "password_2"},
        };
    }
}

