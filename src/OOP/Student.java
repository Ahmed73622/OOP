package OOP;

import java.time.Year;
import java.util.Map;

public class Student
{
    public int    StudentId;
    public int    ClassId;
    public String StudentName;
    public GENDER Gender;
    public Year   Year;

    private Boolean __presented;

    public Map<String, String> StudentDetails()
    {}

    public Map<String,String> PayFees()
    {}

    public Boolean IsPresent()
    {
        return __presented;
    }

    public enum GENDER
    {
        MALE,
        FEMALE
    }
}
