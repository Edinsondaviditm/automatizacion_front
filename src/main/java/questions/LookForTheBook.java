package questions;

import models.CreateAmazonEntity;
import models.ModelGeneric;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.junit.Assert;

public class LookForTheBook implements Question<Boolean> {
    public LookForTheBook(){}
    @Override
    public Boolean answeredBy(Actor actor) {

        boolean resulted = false;

        String ansTitleFront = ModelGeneric.getLblNameBook().toUpperCase();
        String msgExpected = CreateAmazonEntity.getLookFor().getSearchABook().toUpperCase();

        Assert.assertEquals(ansTitleFront, msgExpected);
        String ansTabFront = ModelGeneric.getTabBook().substring(0,9).toUpperCase();
        String msgExpectedTab = CreateAmazonEntity.getLookFor().getAssertTab().toUpperCase();

        Assert.assertEquals(msgExpectedTab,ansTabFront);

        Assert.assertEquals(CreateAmazonEntity.getLookFor().getAssertOneAuthor(),ModelGeneric.getAssertOneAuthor());
        Assert.assertEquals(CreateAmazonEntity.getLookFor().getAssertCar(),ModelGeneric.getAssertTwo());

        if(ansTitleFront.equals(msgExpected)){
            resulted = true;
        }

        return resulted;
    }
    public static LookForTheBook wasSuccessful() {
        return new LookForTheBook();
    }
}


