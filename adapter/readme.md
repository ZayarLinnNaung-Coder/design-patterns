# Adapter Pattern

There're two types of adapter pattern named class adapter and object adapter.

### Class Adapter Pattern
<img src="https://user-images.githubusercontent.com/84829442/229367120-9ebf73f5-6acd-44bb-bbd9-a3f8d2ca506b.png" width="65%">

### Object Adapter Pattern
<img src="https://user-images.githubusercontent.com/84829442/229366798-0fbd6ff0-6fbe-40e0-be90-79b05d53c68e.png" width="65%">

**Client Code**
```bash
public class App {
    public static void main(String[] args) {
        Framework framework = new CalculatorAdapter();
        int result = framework.add(10, 20);
        System.out.println(result);
    }
}
```
