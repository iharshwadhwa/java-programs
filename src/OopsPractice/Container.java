package OopsPractice;

public class Container implements example1 <Integer>{
    private Integer item;

    @Override
   public void add(Integer item){
        this.item=item;
    }
    @Override
    public Integer get(){
        return item;
    }
}
