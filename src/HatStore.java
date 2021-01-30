public abstract class HatStore {
    public HeadWear orderHat(String type){
        HeadWear hat;
        hat = createHat(type);
        return hat;
    }
    protected abstract HeadWear createHat(String type);
}
