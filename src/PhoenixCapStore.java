public class PhoenixCapStore extends CapStore {
    public CapAbstract createCap(String obj){
        if (obj.equals("coyotes")){
            return new CoyotesCap();
        }
        else if (obj.equals("cardinals")){
            return new CardinalsCap();
        }
        else if (obj.equals("suns")){
            return new SunsCap();
        }
        else {
            return null;
        }
    }
}
