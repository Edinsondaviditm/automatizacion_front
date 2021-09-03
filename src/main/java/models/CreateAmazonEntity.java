package models;

import java.util.List;

public class CreateAmazonEntity {

    private static LookFor lookFor = new LookFor();

    private CreateAmazonEntity() {
    }
    public static LookFor getLookFor() {
        return lookFor;
    }

    public static void setLookFor(List<String> data) {

        LookFor lookFor = new LookFor();
        lookFor.setSearchABook(data.get(0));
        lookFor.setAssertOneAuthor(data.get(1));
        lookFor.setAssertCar(data.get(2));
        lookFor.setAssertTab(data.get(3));
        CreateAmazonEntity.lookFor = lookFor;
    }
}
