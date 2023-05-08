## Bridge Pattern

** Decouple an abstraction from its implementation so that the two can vary independently

<img src="https://user-images.githubusercontent.com/84829442/229576063-cc635f7c-8891-457d-b42e-d652b3ac5659.png" width="60%">

<img src="https://user-images.githubusercontent.com/84829442/229579473-64223261-890f-44dc-ab44-b3514b40184b.png" width="60%">

```
public class App {
    public static void main( String[] args ) {
        Device tv = new TV();
        Remote remote = new Remote(tv);

        remote.togglePower();
        System.out.println("On: "+ tv.isEnabled());

        remote.switchChannel(Channel.CHANNEL7);
        System.out.println("Channel: "+ tv.getChannel());

        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.volumeDown();
        remote.volumeDown();
        System.out.println("Volume: " + tv.getVolume());
    }
}
```

