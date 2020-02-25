package cn.maomao.pojo;

public class Airplane {
    private int id;
    private String airNo;
    private int time;
    private double price;
    private Airport takePort;
    private Airport landPort;

    public Airplane() {
    }

    public Airplane(int id, String airNo, int time, double price, Airport takePort, Airport landPort) {
        this.id = id;
        this.airNo = airNo;
        this.time = time;
        this.price = price;
        this.takePort = takePort;
        this.landPort = landPort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirNo() {
        return airNo;
    }

    public void setAirNo(String airNo) {
        this.airNo = airNo;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Airport getTakePort() {
        return takePort;
    }

    public void setTakePort(Airport takePort) {
        this.takePort = takePort;
    }

    public Airport getLandPort() {
        return landPort;
    }

    public void setLandPort(Airport landPort) {
        this.landPort = landPort;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", airNo='" + airNo + '\'' +
                ", time=" + time +
                ", price=" + price +
                ", takePort=" + takePort +
                ", landPort=" + landPort +
                '}';
    }
}
