public class ChicagoCapStore extends CapStore {
    CapAbstract createCap(String obj){
        if (obj.equals("bulls")){
            return new BullsCap();
        }
        else if (obj.equals("bears")){
            return new BearsCap();
        }
        else if (obj.equals("blackhawks")){
            return new BlackHawksCap();
        }
        else {
            return null;
        }
    }
}
