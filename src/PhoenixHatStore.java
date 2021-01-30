public class PhoenixHatStore extends HatStore {
    public HeadWear createHat(String obj){
        if (obj.equals("text")){
            return (HeadWear) new PhoenixTextOnly();
        }
        else if (obj.equals("sticker")){
            return new (HeadWear) PhoenixStickerOnly();
        }
        else if (obj.equals("logo")){
            return new (HeadWear) PhoenixLogoOnly();
        }
        else {
            return null;
        }
    }
}
