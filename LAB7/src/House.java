import java.util.Objects;

public class House extends Property {

    int numberOfFlors;
    public House(String address, int size, double price) {
        super(address, size, price);
        this.numberOfFlors = numberOfFlors;
    }

    public double GetNumberOfFlors(){
        return numberOfFlors;
    }

    public void setNumberOfFlors(int numberOfFlors) {
        this.numberOfFlors = numberOfFlors;
    }


    @Override
    public String toString(){
        return "Poperty{" + "address= " + address + "size= " + size + "price= "+ price+ "numberOfFloor= " + numberOfFlors + "}";

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
