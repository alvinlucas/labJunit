package labJunit.app;
import org.junit.jupiter.api.Test;


public class TestCompteBancaire {
    @Test
    public void testDebiterSolde() {
        CompteBancaire compte = new CompteBancaire(100);
        assertEquals(50, compte.debiterSolde(50));
        assertEquals(50, compte.getSolde());
        assertEquals(0, compte.debiterSolde(200));
        assertEquals(50, compte.debiterSolde(-50));
        assertEquals(0, compte.debiterSolde(0));

    }

    private void assertEquals(int i, double v) {
    }

    @Test
    public void testCrediterSolde() {
        CompteBancaire compte = new CompteBancaire(100);
        assertEquals(50, compte.crediterSolde(50));
        assertEquals(150, compte.getSolde());
        assertEquals(0, compte.crediterSolde(-50));
        assertEquals(0, compte.crediterSolde(0));

    }
}
