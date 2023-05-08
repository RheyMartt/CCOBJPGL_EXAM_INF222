package Location;

import I.Tourist;

public class Boracay implements Locations {

    int airFare = 280;

    public int bayadpamasahe() {
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
