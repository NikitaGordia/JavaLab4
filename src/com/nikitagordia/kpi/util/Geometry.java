package com.nikitagordia.kpi.util;

import com.nikitagordia.kpi.model.Circle;

public class Geometry {

     public static int RESULT_INTERSECT = 1 << 1;
     public static int RESULT_TOUCH = 1 << 2;
     public static int RESULT_EMPTY = 1 << 3;

     private static float dist(Circle a, Circle b) {
         return (float)Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
     }

     public static int checkCircles(Circle a, Circle b) {
         float d = dist(a, b);
         if (d > a.getR() + b.getR()) return RESULT_EMPTY;
         if (Math.abs(d - a.getR() - b.getR()) < 0.0000001) return RESULT_TOUCH;
         return RESULT_INTERSECT;
     }
}
