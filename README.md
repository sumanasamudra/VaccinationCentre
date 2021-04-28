# VaccinationCentre
This is the simple maven project to find distance between two point of locations
# Technology and Tools used
1. Java 8 
2. Maven
3. Junit
4. Eclipse
# Setup and configuration
Configure pom.xml and add dependencies
> <dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.5</version>
 </dependency>
 > <dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
 </dependency>
  > <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>

# To run the project
Download or clone the project
1. cd c:\project
2. mvn package
3. mvn clean
4. java -cp target/Vaccination_Centre-1.0-SNAPSHOT.jar com.hpe.Vaccination_Centre

