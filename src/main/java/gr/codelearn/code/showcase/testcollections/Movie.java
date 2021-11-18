package gr.codelearn.code.showcase.testcollections;

public class Movie {
    private String id;
    private String title;

    public Movie () {
        id=null;
        title=null;
    }

    public Movie(String idIn, String titleIn) {
        id = idIn;
        title = titleIn;
    }

    public String toString() {
        return "ID: '" + this.id + "', Title: '" + this.title;
    }
}
