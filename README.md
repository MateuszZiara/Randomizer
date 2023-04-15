# Randomizer
Simple functions that returns a random integer,  random string with a custom length and function that saves values into a file. Arguments are separated by commas. Code is created with intention of SQLLOADER APP

Example of the code:
```java
public class Main {
    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();
        for(int i = 0; i < 100; i++)
        {
            randomizer.saveToFile("data.dat",i,randomizer.random_string(5),randomizer.random_int(2,10),"Hello");
        }

    }
}
```
