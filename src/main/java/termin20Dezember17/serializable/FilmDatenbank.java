package termin20Dezember17.serializable;

import java.util.ArrayList;
import java.util.List;

public class FilmDatenbank {

    private List<Film> filme = new ArrayList<>();

    public List<Film> getFilme() {
        return filme;
    }

    public void addFilm(Film film) {
        filme.add(film);
    }

}
