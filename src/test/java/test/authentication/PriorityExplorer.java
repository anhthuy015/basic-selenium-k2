package test.authentication;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityExplorer {
    @Test(priority = 1)
    public void zMethod() {
        System.out.println("zMethod");
    }
    @Test(priority = 3)
    public void aMethod(){
        System.out.println("aMethod");
        Assert.assertFalse(true);
    }

    @Test(priority = 2, dependsOnMethods = {"aMethod"})
    public void bMethod(){
        System.out.println("bMethod");
    }
}