package tasks;

import interactions.AmazonBooksInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchAbook implements Task {
    public static SearchAbook withTheFollowinData() {
        return instrumented(SearchAbook.class);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {

        authenticateUser(theActor);
    }

    private <T extends Actor> void authenticateUser(T theActor) {
        theActor.attemptsTo(AmazonBooksInteractions.amazonBooks());
    }

}
