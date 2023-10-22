class Rose implements Flower {
    @Override
    public double getPrice() {
        return 10.0;
    }

    @Override
    public void display() {
        System.out.println("This is a rose.");
    }
}

