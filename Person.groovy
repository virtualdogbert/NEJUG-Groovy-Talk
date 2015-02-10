class Person {

    String firstName
    String lastName
    String email
    Date dateCreated
    Date lastUpdated

    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
        email(blank: false, email: true)
    }
}
