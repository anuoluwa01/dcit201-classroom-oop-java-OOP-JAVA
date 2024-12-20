public interface IRentable { //Abstract methods tio be implemented by the child classes of the vehicle class.
    void rent(Customer customer, int days);
    void returnVehicle();
}