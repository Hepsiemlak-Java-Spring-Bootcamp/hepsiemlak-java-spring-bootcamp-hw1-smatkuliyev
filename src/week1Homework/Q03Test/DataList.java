package week1Homework.Q03Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataList {

    User usr1 = new User("buyer", "ali", "can", "1111", "ali.can@gmail.com");
    User usr2 = new User("seller", "veli", "cem", "2222", "veli.cem@gmail.com");
    User usr3 = new User("buyer", "ayse", "sari", "3333", "ayse.sari@gmail.com");
    User usr4 = new User("seller", "ahmet", "tan", "4444", "ahmet.ten@gmail.com");

    RealEstate r1 = new RealEstate("Istanbul", "Bsk", "Flat", "2+1", 3, 110);
    RealEstate r2 = new RealEstate("Ankara", "Kizilay", "Villa", "5+2", 0, 310);
    RealEstate r3 = new RealEstate("Istanbul", "bylkduzu", "Flat", "3+1", 2, 130);
    RealEstate r4 = new RealEstate("Istanbul", "Esnyrt", "Flat", "4+1", 1, 170);
    RealEstate r5 = new RealEstate("Istanbul", "Uskdr", "Flat", "1+1", 5, 70);
    RealEstate r6 = new RealEstate("Istanbul", "Kdky", "Flat", "3+1", 4, 120);
    RealEstate r7 = new RealEstate("Istanbul", "Gngrn", "Flat", "2+1", 7, 110);

    Advert a1 = new Advert(1, usr2, r1, 3500, "2+1, Ogrenciye yari fiyatina");
    Advert a2 = new Advert(1, usr4, r2, 15000, "5+2, Sadece zengine");
    Advert a3 = new Advert(1, usr2, r3, 4000, "3+1, Aileye kiraya verilecek");
    Advert a4 = new Advert(1, usr4, r4, 5500, "4+1, Kurumsal calisana kiraya verilecek");
    Advert a5 = new Advert(1, usr2, r5, 1500, "1+1, bekara iki katı fiyatina");
    Advert a6 = new Advert(1, usr4, r6, 2800, "3+1, kim isterse");
    Advert a7 = new Advert(1, usr2, r7, 2200, "2+1, Acil yari fiyatina");

    List<Advert> adList = new ArrayList<Advert>(Arrays.asList(a1, a2, a3, a4, a5, a6, a7));
    List<Advert> ayseFavoriList = new ArrayList<Advert>(Arrays.asList(a2, a3, a4, a6));


    Message m1 = new Message("indirim ", "abi ben ogrenciyim, indirim yapar mısın?", usr1, usr2);
    Message m2 = new Message("Bindirim", "Ben ogrenciye ve bekara ancak bindirim yaparım", usr2, usr1);
    Message m3 = new Message("Uygun   ", "abi uyguna yapar mısın?", usr3, usr4);
    Message m4 = new Message("UygunCevap", "Olmaz, ben zaten zararina satis yapiyorum", usr4, usr3);
    Message m5 = new Message("Abi yapma", "Nasilsin?", usr1, usr4);
    Message m6 = new Message("Cok pahali", "Bu kadar da olmaz, resmen hırsızlık bu", usr3, usr2);

    List<Message> messageList = new ArrayList<>(Arrays.asList(m1, m2, m3, m4, m5, m6));

    public List<Advert> getAdList() {
        return adList;
    }

    public List<Advert> getAyseFavoriList() {
        return ayseFavoriList;
    }

    public List<Message> getMessageList() {
        return messageList;
    }
}