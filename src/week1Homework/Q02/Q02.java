package week1Homework.Q02;

public class Q02 {
    /*
    Java'da coklu kalitima izin vermiyor. aslinda soyle diyelim, sadece bir tane class'a extends etmeye izin veriyor ve
    birden fazla interface'e implements etmeye ye de izin veriyor. Birden fazla interface'e izin vermesinin sebebi sonucta
    bir interface'dekilerin hepsini @Override ettigimiz icindir. mesela 5 interface'de ayni isimli method olsa bile fark etmez.
    Ama class'larda durum farkli cunki class'larda hepsini override etme gibi bir mecburiyetimiz yok. Boyle durumda child class hangi
    parent class'in ozelliklerini kullanacagini bilemez.Bu yuzden java buna izin vermiyor. (OOP ile de saglayamayiz)

    Bir kac tane dil multiple inheritance'a izin veriyor. Onlardan bir tanesi C++, C++ multiple inheritance ustesinde nasil
    geliyor diyorsaniz. virtual anahtar kelimesini kullanarak parent class'lardan gelenlerden sadece bir tanesini kendisinde
    tutmasini sagliyor.

     */
}

    class extendsDeneme extends Q02{
    /*
    burada sadece bir class'a extends edebiliyoruz, ikinci bir class a da extends etmeye calisirsak compile time error
    hatasi veriyor (Class cannot extend multiple classes)
     */
}

    class implementsDeneme implements Q02_A, Q02_B, Q02_C {
        @Override
        public void sum() {

        }
    /*
    burada gordugumuz gibi birden fazla interface implement edebiliriyoruz
     */
}