package OopsPractice;

public class Piano extends Instrument{
    @Override
    public void tune(){
        System.out.println("Tuning the piano keys");
    }
    @Override
    public void play(){
        System.out.println("playing the piano");
    }
}
