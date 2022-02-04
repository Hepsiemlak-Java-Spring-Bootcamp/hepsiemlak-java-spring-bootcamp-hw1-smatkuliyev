package week1Homework.Q03Test;

public class Advert {
    private int id;
    private User user;
    private RealEstate realEstate;
    private int price;
    private String title;

    public Advert(int id, User user, RealEstate realEstate, int price, String title) {
        this.id = id;
        this.user = user;
        this.realEstate = realEstate;
        this.price = price;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RealEstate getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(RealEstate realEstate) {
        this.realEstate = realEstate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", user=" + user +
                ", realEstate=" + realEstate +
                ", price=" + price +
                ", title='" + title ;
    }

}
