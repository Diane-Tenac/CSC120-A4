class Main{
    public static void main(String[] args)
    {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
    System.out.println("Out of fuel.");
    }
}

