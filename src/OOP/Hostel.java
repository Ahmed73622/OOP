package OOP;

import java.util.Map;

public class Hostel {
    public int studentId;
    public int roomNumber;
    public int blockNumber;

    private Boolean __checkOut;

    public Map<String, String> HostelDetails()
    {
        
    }

    public Boolean CheckIn()
    {
        return !__checkOut;
    }

    public Boolean CheckOut()
    {
        return __checkOut;
    }
}
