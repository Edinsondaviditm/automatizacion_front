package interactions;

import models.CreateAmazonEntity;
import models.ModelGeneric;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import utils.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.AmazonBookObj.*;

public class AmazonBooksInteractions implements Interaction {

    public static Interaction amazonBooks() {

        return instrumented(AmazonBooksInteractions.class);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        String nameBook = CreateAmazonEntity.getLookFor().getSearchABook();

        theActor.attemptsTo(Check.whether(IMAGE.resolveFor(theActor).isVisible()).andIfSo(
                Enter.theValue(nameBook).into(LOOKFOR),
                Click.on(BTN_LOOKFOR)));

        theActor.attemptsTo(Click.on(BOOK));

        ModelGeneric.setAssertOneAuthor(ASSERT_ONE_AUTHOR.resolveFor(theActor).getText().trim());
        ModelGeneric.setLblNameBook(TITLE_NAME_BOOK.resolveFor(theActor).getText().trim());
        ModelGeneric.setTabBook((TAB_INF_BOOK.resolveFor(theActor).getText().trim()));

        theActor.attemptsTo(Click.on(RADIO_BTN), Wait.elementIsVisible(5));

        ModelGeneric.setAssertTwo(ASSERT_TWO.resolveFor(theActor).getText().trim());
    }
}
