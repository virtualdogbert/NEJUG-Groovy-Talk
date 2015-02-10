@Grab("spring-boot-starter-actuator")

@RestController
class ThisWillReallyRun{
	@RequestMapping("/")
	String home() {
		"Hello World!"
	}
}

//spring run tweetableMicroService.groovy

//http://localhost:8080/