# Factory-Method Design Pattern


### Logger Demo
<img src="https://user-images.githubusercontent.com/84829442/227927622-f3ae6b77-c39a-4b02-81fd-c3df663939db.png" width="65%">


**Client Code**
```bash
public class App {

    public static void main(String[] args) {
        LoggerFactory loggerFactory = new ConsoleLoggerFactory();
        loggerFactory.getLogger().info("HELLO");

        LoggerFactory loggerFactory2 = new FileLoggerFactory();
        loggerFactory2.getLogger().info("HELLO");
    }
    
}
```
