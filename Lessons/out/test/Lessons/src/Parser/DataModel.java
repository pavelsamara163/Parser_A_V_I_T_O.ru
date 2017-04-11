package Parser;

public class DataModel {

    private String auto;
    private String probeg;
    private String motor;
    private String bak;
    private String privod;
    private String model;
    private String rule;
    private String ptc;
    private String color;
    private String broken;
    private String probegName;
    private String price;
    private String read;
    private String vladelec;
    private String contact;
    private String item_data;
    private String number;


    public DataModel(String auto, String probeg, String motor, String bak,String privod,String model,String rule,String ptc,String color,String broken,
                     String probegName,String price,String read,String vladelec,String contact,String item_data,String number) {
        this.auto = auto;
        this.probeg = probeg;
        this.motor = motor;
        this.bak = bak;
        this.privod = privod;
        this.model = model;
        this.rule = rule;
        this.ptc = ptc;
        this.color = color;
        this.broken = broken;
        this.probegName = probegName;
        this.price = price;
        this.read = read;
        this.vladelec = vladelec;
        this.contact = contact;
        this.item_data = item_data;
        this.number = number;

    }

    String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getProbeg(int cellIndex) {
        return probeg;
    }

    public void setProbeg(String probeg) {
        this.probeg = probeg;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    public String getPrivod() {
        return privod;
    }

    public void setPrivod(String privod) {
        this.privod = privod;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getPtc() {
        return ptc;
    }

    public void setPtc(String ptc) {
        this.ptc = ptc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBroken() {
        return broken;
    }

    public void setBroken(String broken) {
        this.broken = broken;
    }

    public String getProbegName() {
        return probegName;
    }

    public void setProbegName(String probegName) {
        this.probegName = probegName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getVladelec() {
        return vladelec;
    }

    public void setVladelec(String vladelec) {
        this.vladelec = vladelec;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getItem_data() {
        return item_data;
    }

    public void setItem_data(String item_data) {
        this.item_data = item_data;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
