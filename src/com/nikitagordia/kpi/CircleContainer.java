package com.nikitagordia.kpi;

import com.nikitagordia.kpi.model.Circle;
import com.nikitagordia.kpi.util.Generator;
import com.nikitagordia.kpi.util.Geometry;

import java.util.Iterator;
import java.util.Set;

public class CircleContainer {

    private Set<Circle> set;

    public CircleContainer(int n) {
        set = Generator.generateCircles(n);
    }

    public String scan() {
        StringBuilder builder = new StringBuilder();

        Iterator<Circle> aI = set.iterator();
        while (aI.hasNext()) {
            Circle a = aI.next();
            Iterator<Circle> bI = set.iterator();
            while (bI.next() != a) {}
            while (bI.hasNext()) {
                Circle b = bI.next();
                if (a == b) continue;
                int res = Geometry.checkCircles(a, b);
                if (res == Geometry.RESULT_EMPTY) continue;
                builder.append("\n\t" + (res == Geometry.RESULT_INTERSECT ? "Intersection" : "Touch") + " found " + a + " with " + b);
            }
        }

        return builder.length() > 0 ? builder.toString() + "\n" : "Empty result set";
    }

    public String formatSet() {
        StringBuilder builder = new StringBuilder();

        if (set.isEmpty()) {
            builder.append("Empty circle set");
        } else {
            builder.append("\nResult (" + set.size() + " circles):");

            int pos = 0;
            Iterator<Circle> c = set.iterator();
            while (c.hasNext())
                builder.append("\n\t[" + ((pos++) + 1) + "] " + c.next());
            builder.append("\n");
        }

        return builder.toString();
    }
}
