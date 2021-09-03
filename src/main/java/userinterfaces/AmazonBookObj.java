package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import utils.AmazonConstant;

public class AmazonBookObj {

    public static final Target IMAGE = Target.the("Image logo").located(By.id("nav-logo-sprites"));
    public static final Target LOOKFOR = Target.the("LOOKFOR").located(By.id("twotabsearchtextbox"));
    public static final Target BTN_LOOKFOR = Target.the("Look for button").located(By.xpath("//input[@value='Go']"));
    public static final Target BOOK = Target.the("Book").located(By.xpath("//span[text()=\"A Practitioner's Guide to Software Test Design\"]"));
    public static final Target TITLE_NAME_BOOK = Target.the("Book Name").locatedBy("//*[@class='a-size-extra-large']");
    public static final Target TAB_INF_BOOK = Target.the("TAB midle book").locatedBy("//*[@id=\"mediaTab_heading_2\"]");
    public static final Target RADIO_BTN = Target.the("Radio btn").locatedBy("//*[@class='a-icon a-accordion-radio a-icon-radio-inactive']");
    public static final Target ASSERT_ONE_AUTHOR = Target.the("Assert one Endava Challenge").locatedBy("//*[@class='a-link-normal contributorNameID']");
    public static final Target ASSERT_TWO = Target.the("Assert two Endava challenge").locatedBy("//*[@id='nav-cart-count']");

    private AmazonBookObj() {
        throw new IllegalStateException(AmazonConstant.UI_CLASS);
    }
}
