package oopBasedQuestion;

public class TrackInventoryOfItems {
    int itemCode;
    String itemName;
    int price;
    TrackInventoryOfItems(int itemCode, String itemName, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void display(){
        System.out.println("itemCode: "+this.itemCode+". itemCode: "+this.itemCode+". price: "+this.price);
    }

    public static void main(String[] args) {
        TrackInventoryOfItems book = new TrackInventoryOfItems(101,"ut",2400);
        book.display();
    }
}

