package Main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CubesTest {

    Cubes cubes;

    @Before
    public void setup(){
        cubes = new Cubes();
    }

    @Test
    public void no_obtiene_palabre(){
        Assert.assertFalse(cubes.obtenerPalabra("BOZO"));
        Assert.assertFalse(cubes.obtenerPalabra("CAMPANA"));
    }

    @Test
    public void obtiene_palabre(){
        Assert.assertTrue(cubes.obtenerPalabra("A"));
        Assert.assertTrue(cubes.obtenerPalabra("LIBRO"));
        Assert.assertTrue(cubes.obtenerPalabra("TRAJE"));
        Assert.assertTrue(cubes.obtenerPalabra("COMUN"));
        Assert.assertTrue(cubes.obtenerPalabra("DORITO"));
        Assert.assertTrue(cubes.obtenerPalabra("ARLEQUIN"));
    }
}