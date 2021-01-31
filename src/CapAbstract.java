import java.util.ArrayList;
import java.util.List;

public abstract class CapAbstract {
    String capType;
    double cost;
    List<String> custom = new ArrayList<String>(0);

    void createHat(){
        for (int i = 0; i < custom.size(); i++){
            System.out.println(" "+custom.get(i));
        }
    }
    public String getCap() {
        return capType;
    }
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("This is the cap you ordered: " + capType + "\n");
        display.append("cost: "+ cost + "\n");
        display.append("It has the following customizations: \n");
        for (String customizations : custom){
            display.append(customizations +"\n");
        }
        return display.toString();
    }
}
