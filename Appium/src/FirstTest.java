import lib.CoreTestCase;
import lib.ui.SearchPageObject;

public class FirstTest extends CoreTestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testSearchTest(){
        SearchPageObject searchPageObject = new SearchPageObject(driver);
        searchPageObject.initSearchInput();
        searchPageObject.typeSearchLine("Хоббит, или Туда и обратно");
        searchPageObject.waitForSearchResultAndClick("Хоббит, или Туда и обратно");
        searchPageObject.saveToList();
        searchPageObject.goToBack();
        searchPageObject.goToBack();
        searchPageObject.goToSaveList();
        searchPageObject.goToSaveListInSavedAndGetOptions();
        searchPageObject.deleteSavedTitle();
    }
}