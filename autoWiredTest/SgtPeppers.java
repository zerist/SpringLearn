package autoWiredTest;

import org.springframework.stereotype.Component;
@Component
public class SgtPeppers implements CompactDisc{
    private String title = "effective java";
    private String artist = "the beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
