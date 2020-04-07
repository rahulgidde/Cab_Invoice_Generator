import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RidRepository {

    Map<String, ArrayList<Ride>> arrayListMap = null;

    public RidRepository() {
        this.arrayListMap = new HashMap<>();
    }

    public ArrayList getRideDetails(String userId) {
        return arrayListMap.get(userId);
    }

    public void addRide(String userId, Ride[] rides) {
        ArrayList arrayList = this.arrayListMap.get(userId);
        if (arrayList == null) {
            this.arrayListMap.put(userId, new ArrayList<Ride>(Arrays.asList(rides)));
        }
    }
}
