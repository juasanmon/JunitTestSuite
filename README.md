# JunitTestSuite

GitClone: https://github.com/juasanmon/JunitTestSuite.git



Para poder ejecutar el JunitTestSuite debemos modificar el JunitTestSuite con el siguiente codigo:


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
   MathTest.class,
   TestPerson.class
})
public class JunitTestSuite {   
}  	


Para que el proyecto pueda ejecutar las clases adecuadas (que ya están compiladas, es decir añadimos los class).

Debemos compilar las siguientes clases:

El primero sería:
java -cp /home/alumnado/jars/*:. Math.java

A continuación el testing:
java -cp /home/alumnado/jars/*:. MathTest.java

Y por último el test:
java -cp /home/alumnado/jars/*:. JunitTestSuite.java
