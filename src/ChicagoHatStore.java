public class ChicagoHatStore extends HatStore {
    HeadWear createHat(String obj){
        if (obj.equals("text")){
            return new ChicagoTextOnly();
        }
        else if (obj.equals("sticker")){
            return new ChicagoStickerOnly();
        }
        else if (obj.equals("logo")){
            return new ChicagoLogoOnly();
        }
        else {
            return null;
        }
    }
}
