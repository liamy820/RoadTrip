import java.util.ArrayList;

public class RoadTrip
{
    private ArrayList<GeoLocation> road;
    // Create a GeoLocation and add it to the road trip
    public RoadTrip()
    {
       road = new ArrayList<GeoLocation>();     
    }
    public void addStop(String name, double latitude, double longitude)
    {
       GeoLocation stop = new GeoLocation (name, latitude, longitude);
       road.add(stop);
    }
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        return road.size();
    }
    // Get the total miles of the trip
    public double getTripLength()
    {
        double length = 0;
        for (int i = 0; i < road.size() - 1 ; i++)
        {
            GeoLocation start = road.get(i);
            GeoLocation end = road.get(i + 1);
            double distance = start.distanceFrom(end);
            length += distance;
        }
        return length;
    }
    // Return a formatted toString of the trip
    public String toString()
    
    {
        String result = "";
        for (int i = 0; i < road.size(); i++)
        {
            result += (i + 1) + ". " + road.get(i) + "\n";
        }
        return result;
    }
}