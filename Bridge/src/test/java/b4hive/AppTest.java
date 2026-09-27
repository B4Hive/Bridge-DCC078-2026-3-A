package b4hive;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testLiquidoQuente() {
        Componente liquidoQuente = new Liquido(new Quente());
        assertTrue(liquidoQuente.get().equals("LiquidoQuente"));
    }

    @Test
    public void testLiquidoFrio() {
        Componente liquidoFrio = new Liquido(new Frio());
        assertTrue(liquidoFrio.get().equals("LiquidoFrio"));
    }

    @Test
    public void testLiquidoAmeno() {
        Componente liquidoAmeno = new Liquido(new Ameno());
        assertTrue(liquidoAmeno.get().equals("LiquidoAmeno"));
    }

    @Test 
    public void testGasosoQuente() {
        Componente gasosoQuente = new Gasoso(new Quente());
        assertTrue(gasosoQuente.get().equals("GasosoQuente"));
    }

    @Test
    public void testGasosoFrio() {
        Componente gasosoFrio = new Gasoso(new Frio());
        assertTrue(gasosoFrio.get().equals("GasosoFrio"));
    }

    @Test
    public void testGasosoAmeno() {
        Componente gasosoAmeno = new Gasoso(new Ameno());
        assertTrue(gasosoAmeno.get().equals("GasosoAmeno"));
    }

    @Test
    public void testSolidoQuente() {
        Componente solidoQuente = new Solido(new Quente());
        assertTrue(solidoQuente.get().equals("SolidoQuente"));
    }

    @Test
    public void testSolidoFrio() {
        Componente solidoFrio = new Solido(new Frio());
        assertTrue(solidoFrio.get().equals("SolidoFrio"));
    }

    @Test
    public void testSolidoAmeno() {
        Componente solidoAmeno = new Solido(new Ameno());
        assertTrue(solidoAmeno.get().equals("SolidoAmeno"));
    }

}
