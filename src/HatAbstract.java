import java.util.ArrayList;

public abstract class HatAbstract implements HeadWear {
    protected HeadWear uniqueHat;
    ArrayList custom = new ArrayList(0);

    public HatAbstract(HeadWear uniqueHat){
        this.uniqueHat = uniqueHat;
    }
    public void hatType(){
        uniqueHat.hatType();
    }
    void createHat(){
        for (int i = 0; i < custom.size(); i++){
            System.out.println(" "+custom.get(i));
        }
    }
}
