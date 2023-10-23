package OOP;

import java.util.List;
import java.util.NoSuchElementException;

public class Canteen {
    public int          inchargeId;
    public List<String> itemsList;
    public List<String> availableList;

    public List<String> ShowItems()
    {
        return itemsList;
    }

    public void Buy(String item)
    {
        if(itemsList.contains(item))
        {
            //buy;
        }
        else throw new IllegalArgumentException();
    }
}
