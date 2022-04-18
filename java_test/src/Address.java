public class Address {
    private String full_address;
    private boolean delivery_to_door;

    public Address(String full_address, boolean delivery_to_door) {
        this.full_address = full_address;
        this.delivery_to_door = delivery_to_door;
    }
    public String getFull_address() {
        return full_address;
    }
    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }
    public boolean getDelivery_to_door() {
        return delivery_to_door;
    }
    public void setDelivery_to_door(boolean delivery_to_door) {
        this.delivery_to_door = delivery_to_door;
    }
}
