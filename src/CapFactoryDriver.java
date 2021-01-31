public class CapFactoryDriver {
    public static void main(String[] args) {
        CapStore chicagoStore = new ChicagoCapStore();
        CapStore phoenixStore = new PhoenixCapStore();

        CapAbstract cap = chicagoStore.orderCap("blackhawks");
        CapAbstract cap2 = phoenixStore.orderCap("coyotes");
        System.out.println(cap);
        System.out.println(cap2);
    }
}
