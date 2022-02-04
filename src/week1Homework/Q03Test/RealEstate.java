package week1Homework.Q03Test;

public class RealEstate {
    private String province;
    private String district;
    private String type;
    private String numberOfRooms;
    private int stair;
    private int area;

    public RealEstate(String province, String district, String type, String numberOfRooms, int stair, int area) {
        this.province = province;
        this.district = district;
        this.type = type;
        this.numberOfRooms = numberOfRooms;
        this.stair = stair;
        this.area = area;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getStair() {
        return stair;
    }

    public void setStair(int stair) {
        this.stair = stair;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", type='" + type + '\'' +
                ", numberOfRooms='" + numberOfRooms + '\'' +
                ", stair=" + stair +
                ", area=" + area ;
    }
}
