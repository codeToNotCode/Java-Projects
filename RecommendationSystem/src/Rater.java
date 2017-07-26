/**
 * An interface used by plain and efficient rater
 * Only Difference between plain and efficient rater is of efficieny
 * 
 * @author Prasandeep Singh
 * @created 06/25/2017
 */


import java.util.ArrayList;

public interface Rater {

    public void addRating(String item, double rating);
    public boolean hasRating(String item);
    public String getID();
    public double getRating(String item);
    public int numRatings();
    public ArrayList<String> getItemsRated();
}
