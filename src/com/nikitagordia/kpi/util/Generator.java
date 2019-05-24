package com.nikitagordia.kpi.util;

import com.nikitagordia.kpi.model.Circle;

import java.util.HashSet;
import java.util.Random;

public class Generator {

    private static long SEED = 583290943;
    private static float SCALE = 50000;
    private static float RADIUS_SCALE = 10000;

    public static HashSet<Circle> generateCircles(int n) {
        HashSet<Circle> result = new HashSet<Circle>();
        Random random = new Random(SEED);
        for (int i = 0; i < n; i++)
            result.add(new Circle(
                    "#" + (char)('A' + i),
                    random.nextFloat() * SCALE,
                    random.nextFloat() * SCALE,
                    random.nextFloat() * RADIUS_SCALE
            ));
        return result;
    }
}
