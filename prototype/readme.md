### Prototype Design Pattern

![UML class (4)](https://user-images.githubusercontent.com/84829442/229164979-7a3966ae-9df0-4863-ae0c-871bb274aec8.png)

**Client Code**
```bash
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Zayar Linn Naung", 23, "???");
        Employee e2 = (Employee) e1.reproduce();
        System.out.println(e1);
        System.out.println(e2);
    }
}
```
