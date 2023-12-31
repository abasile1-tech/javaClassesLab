import com.codebase.Printer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//Create a Printer class that has a property for number of sheets of paper left.
//Add a method to print that takes in a number of pages and number of copies.
//The print method will only run if the printer has enough paper. If it runs it will reduce the value of the
// paper left by number of copies * number of pages.
//Add a toner volume property to the class.
//Modify the printer so that it reduces the toner by 1 for each page printed.

public class PrinterTest {
    Printer epsonInkJet;

    @Before
    public void before() {
        epsonInkJet = new Printer(100, 50);
    }

    @Test
    public void canPrint() {
        epsonInkJet.print(20,2);
        assertEquals(60, epsonInkJet.getSheetsOfPaper());
        assertEquals(10, epsonInkJet.getTonerVolume());
    }
}
