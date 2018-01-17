package termin20Dezember17.serializable;

import java.io.Serializable;

public class Film implements Serializable {

    private String name;
    private String genre;
    private String veroeffentlichungsJahr;
    private transient int rating;

    public Film(String name, String genre, String veroeffentlichungsJahr) {
        this.name = name;
        this.genre = genre;
        this.veroeffentlichungsJahr = veroeffentlichungsJahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVeroeffentlichungsJahr() {
        return veroeffentlichungsJahr;
    }

    public void setVeroeffentlichungsJahr(String veroeffentlichungsJahr) {
        this.veroeffentlichungsJahr = veroeffentlichungsJahr;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
