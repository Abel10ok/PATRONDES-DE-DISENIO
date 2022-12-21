package observer_04;

import java.util.ArrayList;
import java.util.List;

public class Portal implements Observer {

    public Portal() {
    }

    @Override
    public void update(Vuelos vuelo) {
        System.out.println("nuevo vuelo"+ vuelo);
    }
}
