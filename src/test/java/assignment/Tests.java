package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void code(){
       App.main(null);
       assertEquals("a, b, c, e, f", App.topFiveMovies("a", "b", "c", "d", "e"), "INCORRECT. DID OYU ADD COMMAS AND SPACES?");
   }

   @Test
    public void late() {
        App.main(null);
        assertTrue(DueDate.onTime(2020, 12, 16), "Submitted Late");
    }


}
