package termin24Januar18.builder.main;

import termin24Januar18.builder.Person;
import termin24Januar18.builder.PersonenBuilder;

public class BuilderMain {

    public static void main(String[] args) {

        Person p = new PersonenBuilder("Zimmermann", "Julian")
                .withAlter(20)
                .withAdresse("Würzburg")
                .build();


    }

}
