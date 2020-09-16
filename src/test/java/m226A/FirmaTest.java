package m226A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirmaTest {

    @Test
    void addKunde() {
        Firma firma = new Firma();
        firma.addKunde( "Michael",  "Pellicoro");
        assertTrue(firma.getKunden().size()==1);
    }

    @Test
    void delKunde() {
        Firma firma = new Firma();
        firma.addKunde("Michael", "Pellicoro");
        firma.delKunde("Pellicoro");
        assertEquals(firma.getKunden().size(), 0);


    }
}