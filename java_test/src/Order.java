public class Order {
    private String number;
    private float total;
    private int item_count;
    private String deliver_at; //не совсем то, что нужно. Но как объявить дату в предложенном формате я не смог разобраться. Нашёл способ через this.date=new Date(year, month, day), но это уже не используется в java
    private Address address;
    private Shipment shipment; //по идее тут должен быть массив из shipment, но не получилось найти как это правильно объявить и использовать. Может через ArrayList<Shipment>?

    public Order(String number, float total, int item_count, String deliver_at, Address address, Shipment shipment) {
        this.number = number;
        this.total = total;
        this.item_count = item_count;
        this.deliver_at = deliver_at;
        this.address = address;
        this.shipment = shipment;
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
    public String getDeliver_at() {
        return deliver_at;
    }
    public void setDeliver_at(String deliver_at) {
        this.deliver_at = deliver_at;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Shipment getShipment() {
        return shipment;
    }
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
}
