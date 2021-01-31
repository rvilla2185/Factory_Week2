public abstract class CapStore {
    abstract CapAbstract createCap(String type);
    public CapAbstract orderCap(String type){
        CapAbstract cap = createCap(type);
        return cap;
    }
}
