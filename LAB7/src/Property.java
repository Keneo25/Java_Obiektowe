import java.util.Objects;

public class Property {
    public  String address;
    public int size;
    public double price;

    public Property(String address, int size, double price){
        this.address = address;
        this.size = size;
        this.price = price;
    }

    public String GetAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int GetSize(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double GetPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

     @Override
    public String toString(){
     return "Poperty{" + "address= " + address + "size= " + size + "price= "+ price+ "}";

 }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Property property = (Property) o;
        return size== property.size && Double.compare(property.price,price) == 0 && Objects.equals(address, property.address);
    }


    @Override
    public int hashCode(){
        return Objects.hash(address, size, price);
    }





}