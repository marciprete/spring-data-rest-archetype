# spring-data-rest-archetype

A very basic maven archetype to bootstrap Spring Data Rest applications.
It includes a sample entity, a paging and sorting repository, integration and unit tests. 

## Generated Project
The generated project will be bootstrapped with Spring Platform Bom - version Brussels-SR4.
For info about the versions, refer to  http://platform.spring.io/platform/

The main characteristics are:

* Java configured spring project
* Jpa (Hibernate, SpringDataJpa)
* REST (Spring Data Rest WebMvc)
* MySQL connector 
* Junit tests
* Integration tests

### Prerequisites

* JDK 8
* Maven 3.0+


```
mvn archetype:generate \
        -DarchetypeGroupId=it.senape \
        -DarchetypeArtifactId=spring-data-rest-archetype \
        -DarchetypeVersion=1.0.0 \
        -DgroupId=my.groupid \
        -DartifactId=my-artifactId \
        -Dversion=version \
        -DinteractiveMode=true \
        -DarchetypeRepository=http://marciprete.github.io/spring-data-rest-archetype
```

### Installing

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Michele Arciprete** - *Initial work* 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
