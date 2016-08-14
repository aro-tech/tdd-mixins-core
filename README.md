# tdd-mixins-core
Java-8 default interfaces useful for a test fixture
Contains AssertJ and the ExtendedMockito mixins
Does not require any specific test library such as JUnit or TestNG

Requires Java 8 (or higher)

NOte - if you plan to use JUnit 4 for your tests, try [tdd-mixins-junit4] (https://github.com/aro-tech/tdd-mixins-junit4).


##Latest release

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.aro-tech/tdd-mixins-core/badge.svg)](http://search.maven.org/#artifactdetails|com.github.aro-tech|tdd-mixins-core|0.9.6|jar)

v0.9.6: [Release notes on github] (https://github.com/aro-tech/tdd-mixins-core/releases/tag/v0.9.6)

[Binary downloads] (https://oss.sonatype.org/content/groups/public/com/github/aro-tech/tdd-mixins-core/0.9.6/ "binaries")

In Maven:

```html
<dependency>
  <groupId>com.github.aro-tech</groupId>
  <artifactId>tdd-mixins-core</artifactId>
  <version>0.9.6</version>
  <scope>test</scope>
</dependency>

##Example usage 
```
	public class EmployeeTest implements ExtendedMockito, AssertJ { 
	...
```	

```
	when(mock.extractInformationFrom(toStringContainsAllOf("Gollum", "Smeagol"))).thenReturn("Shire. Baggins.");
```

```
	assertThat(answer).contains("Shire", "Baggins");
```
		
 
##Blog
[![The Green Bar](https://img.shields.io/badge/My_Blog:-The_Green_Bar-brightgreen.svg)](https://thegreenbar.wordpress.com/)
