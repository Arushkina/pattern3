class Strawberry implements PricedItem {
    @Override
    public double getPrice() {
        return 5.0; // Example price for a strawberry
    }
    void show() {
        System.out.println("This is a strawberry.");
    }
}
