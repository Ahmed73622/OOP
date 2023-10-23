package OOP;

import java.util.Map;

public class Classroom
{
    public int    classId;
    public int    departmentId;
    public String section;

    private Boolean __occupied;

    public Map<String, String> ClassroomDetails()
    {

    }

    public Boolean IsOccupied()
    {
        return __occupied;
    }
}
