 [Current Reading](https://docs.spring.io/spring-boot/docs/2.1.3.RELEASE/reference/htmlsingle/#using-boot-build-systems) [@](https://docs.spring.io/spring-boot/docs/2.1.3.RELEASE/reference/htmlsingle/#getting-started-first-application-executable-jar)

### Configuration

IDE: IntelliJ IDEA

JDK: 1.8.0_141

Project Language Level: 10

Maven: 3.3.9

### Notes

**@EnableAutoConfiguration**: Spring Boot will 'guess' how we want to configure Spring, based on the jar dependencies we've added. In the case of the simple spring-boot application, we've used `spring-boot-starter-web`which addes Tomcat and Spring MVC, so the auto-configuration assumes that we're developing a web application and will set up Spring accordingly.

**@RestController**: Indicates to Spring that the annotated class should be considered when handling incoming web requests. This is a **Stereotype Annotation**. It provides hints for people reading the code and for Spring that the class plays a specific role. (Spring MVC annotation).

**@RequestMapping**: Provides 'routing' information. It tells spring that any HTTP request with the `/` path should be mapped to the `index` method. The **@RestController** annotation tells Spring to render the resulting string directly back to the caller.

**"main" Method**: The final part of our simple application is the `main` method. This is a standard method that follows the Java convention for an application entry point. Our main method delegates to Spring Boot's `SpringApplication` class by calling `run`. `SpringApplication` bootstraps our application, starting Spring, which, in turn, starts the auto-configured Tomcat web server. We need to pass the `SpringBoot.class` as an argument to the `run` method to tell `SpringBootApplication` which is the primary Spring component. The `args` array is also passed through to expose any command-line arguments.