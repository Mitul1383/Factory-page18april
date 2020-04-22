package uk.co.expedia.testsuit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.resources.runners.testbase.TestBase;

public class FlightTest extends TestBase {
    HomePage homePage;
    FlightTest flightTest;

    @BeforeMethod(groups = {"sanity", "smoke", "regression"}) public void setUp() {
        homePage = new HomePage();
        flightTest = new FlightTest();
    }
    /*String enterFlyingLocation = "Luton";
    String enterGoingToLocation = "Baroda";
    String enterDate = "12/09/2020";
    String enterReturn = "17/12/2020";*/

    @Test(groups = {"sanity", "regression"}, priority = 1)
    public void verifyUserShouldFindDestinationAccordingToUserRequirement() {
        homePage.clickOnAcceptButton();
        homePage.clickOnFlightButton();
        FlightTest.enterFlyingFrom("Luton  (Luton Airport)");
        //flightsPage.enterFlyingFrom(Luton);
        FlightTest.enterGoingto("Baroda (Baroda Int Airport)");
        //flightsPage.enterGoingTo(Baroda);
        FlightTest.enterDepartingDate("12/09/2020");
        //flightsPage.enterDepartingDate(enterDate);
        FlightTest.enterReturningDate("17/12/2020");
        //flightsPage.enterReturningDate(enterReturn);
        FlightTest.clickOnTravellers();
        FlightTest.clickOnAdults();
        FlightTest.clickOnClose();
        FlightTest.clickOnSearchButton();
        String expectedResult = "Select your departure to Baroda";
        String actualResult = FlightTest.getDestinationText();
        Assert.assertEquals(expectedResult, actualResult);


    }

    private static void clickOnSearchButton() {
    }

    private static void clickOnClose() {
    }

    private static void clickOnAdults() {
    }

    private static void clickOnTravellers() {
    }

    private static String getDestinationText() {
        return null;
    }

    private static void enterReturningDate(String s) {
    }

    private static void enterDepartingDate(String s) {
    }

    private static void enterGoingto(String s) {
    }

    private static void enterFlyingFrom(String s) {
    }
}