//@Estefania Elvira 
import java.util.Comparator;

class Compare<E extends Comparable<E>>
{

    public int compare(E a, E b)
    {
        return a.compareTo(b);
    }
} 