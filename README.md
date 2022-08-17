# Spring component annotation
## Demonstrating the usage of:
1. @Autowired
2. @Qualifier
3. @PostConstruct

Note that both @PostConstruct and @PreDestroy annotations are part of Java EE. And since Java EE has been deprecated in Java 9 and removed in Java 11 we have to add an additional dependency to use these annotations:
[maven javax.annotation](https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3)
