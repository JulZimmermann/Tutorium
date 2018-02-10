package termin24Januar18.builder;

public class PersonenBuilder {

    private Person person;

    public PersonenBuilder(String name, String vorname) {
        person = new Person(name, vorname);
    }

    public PersonenBuilder withAlter(int alter) {
        person.alter = alter;
        return this;
    }

    public PersonenBuilder withAdresse(String adresse) {
        person.adresse = adresse;
        return this;
    }

    public Person build() {
        return person;
    }

}
