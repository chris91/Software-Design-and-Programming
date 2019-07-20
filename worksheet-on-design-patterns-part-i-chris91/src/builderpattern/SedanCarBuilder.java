package builderpattern;

public class SedanCarBuilder implements CarBuilder {
    private Car car;

    public SedanCarBuilder(){
        this.car = new Car("SEDAN");
    }

    @Override
    public void buildBodyStyle() {
        this.car.setBodyStyle("External dimensions: overall length (inches): 202.9, overall width (inches): 76.2, overall height (inches): 60.7, wheelbase (inches): 112.9, front track (inches): 65.3, rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
}

    @Override
    public void buildPower() {
        this.car.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm\n");
    }

    @Override
    public void buildEngine() {
        this.car.setEngine("3.5L Duramax V 6 DOHC");
    }

    @Override
    public void buildBreaks() {
        this.car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
    }

    @Override
    public void buildSeats() {
        this.car.setSeats("Front seat center armrest.Rear seat center armrest.Split-folding rear seats");
    }

    @Override
    public void buildWindows() {
        this.car.setWindows("Laminated side windows.Fixed rear window with defroster");
    }

    @Override
    public void buildFuelType() {
        this.car.setFuelType("Gasoline 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
