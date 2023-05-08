package Location;

import I.Tourist;

public class Pgalera implements Locations {

    int airFare = 170;

    public int bayadpamasahe() {
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}