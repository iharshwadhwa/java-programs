package OopsPractice;

public class Guitar extends Instrument {
    @Override
    public void tune(){
        System.out.println("Tuning the guitar strings");
    }

    @Override
    public void play(){
        System.out.println("Playing the Guitar");
    }
}
