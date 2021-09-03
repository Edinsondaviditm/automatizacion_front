package models;

public class ModelGeneric {
    private static String lblNameBook;
    private static String tabBook;
    private static String assertOneAuthor;
    private static String assertTwo;

    public static String getAssertOneAuthor() {
        return assertOneAuthor;
    }

    public static void setAssertOneAuthor(String assertOneAuthor) {
        ModelGeneric.assertOneAuthor = assertOneAuthor;
    }

    public static String getAssertTwo() {
        return assertTwo;
    }

    public static void setAssertTwo(String assertThreeCart) {
        ModelGeneric.assertTwo = assertThreeCart;
    }



    public static String getTabBook() {
        return tabBook;
    }

    public static void setTabBook(String tabBook) {
        ModelGeneric.tabBook = tabBook;
    }

    public static String getLblNameBook() {
        return lblNameBook;
    }

    public static void setLblNameBook(String lblNameBook) {
        ModelGeneric.lblNameBook = lblNameBook;
    }
}
