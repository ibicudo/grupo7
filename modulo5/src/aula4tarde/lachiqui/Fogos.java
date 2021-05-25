package modulo5.src.aula4tarde.lachiqui;

import java.util.Random;

public class Fogos implements FogosEvento{

    @Override
    public void explodir() {
        Random rand = new Random();
        System.out.println(Sons.values()[rand.nextInt(Sons.values().length)].som);
    }
}
