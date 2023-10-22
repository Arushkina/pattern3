class StrawberryAdapter implements ChocolateCoveredFruit {
    private final Strawberry strawberry;

    public StrawberryAdapter(Strawberry strawberry) {
        this.strawberry = strawberry;
    }

    @Override
    public double getPrice() {
        return strawberry.getPrice() + 2.0;
    }

    @Override
    public void display() {
        strawberry.show();
    }
}