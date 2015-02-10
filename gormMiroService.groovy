@Grab("spring-boot-starter-actuator")
@Grab("org.grails:gorm-hibernate4-spring-boot:1.1.0.RELEASE")
@Grab("com.h2database:h2:1.3.173")
import grails.persistence.*
@RestController
class Example {

    @RequestMapping("/")
    String home() {
        def person = new Person(firstName:'Virtual', lastName:'Dogbert')
        person.save()
        [message: 'Hello World']
    }

    @RequestMapping("/get")
    String get() {
        def person = Person.get(1)
        [person: "$person.firstName $person.lastName"]
    }
}

@Entity
class Person {
    String firstName
    String lastName

    static constraints = {
        firstName blank:false
        lastName blank:false
    }
}