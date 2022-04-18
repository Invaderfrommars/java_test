public class Shipment {
    private String number;
    private float total;
    private int item_count;

    public Shipment(String number, float total, int item_count) {
        this.number = number;
        this.total = total;
        this.item_count = item_count;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public int getItem_count() {
        return item_count;
    }
    public void setItem_count(int item_count) {
        this.item_count = item_count;
    }
}
