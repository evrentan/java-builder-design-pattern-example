package evrentan.examples;

public class Main {

    public static void main(String[] args) {
        Person evrenWithFullInfo = Person.PersonBuilder.initialize()
            .withFirstName("Evren")
            .withLastName("Tan")
            .withAge(38)
            .withSex("M")
            .build();

        Person evrenWithName = Person.PersonBuilder.initialize()
            .withFirstName("Evren")
            .build();

        System.out.println(evrenWithFullInfo.toString());
        System.out.println(evrenWithName.toString());
    }
}
