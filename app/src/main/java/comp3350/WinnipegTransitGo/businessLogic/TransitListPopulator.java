package comp3350.WinnipegTransitGo.businessLogic;

/**
 * Layer between presentation and business logic (listview item generator)
 *
 * @author Syed Habib
 * @version 1.0
 * @since 2017-06-2
 */

public interface TransitListPopulator {

    void populateTransitList(String latitude, String longitude);
    boolean isValid(int error);
}
