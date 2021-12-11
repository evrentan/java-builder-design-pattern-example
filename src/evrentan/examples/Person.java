package evrentan.examples;

public class Person {
  private String firstName;
  private String lastName;
  private Integer age;
  private String sex;

  private Person(PersonBuilder personBuilder) {
    this.firstName = personBuilder.firstName;
    this.lastName = personBuilder.lastName;
    this.age = personBuilder.age;
    this.sex = personBuilder.sex;
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", sex='" + sex + '\'' +
        '}';
  }

  public static class PersonBuilder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String sex;

    public static PersonBuilder initialize() {
      return new PersonBuilder();
    }

    public PersonBuilder withFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public PersonBuilder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public PersonBuilder withAge(Integer age) {
      this.age = age;
      return this;
    }

    public PersonBuilder withSex(String sex) {
      this.sex = sex;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }
}
