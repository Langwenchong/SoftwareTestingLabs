package main;

import java.util.Arrays;

/**
 * @Author Lang wenchong
 * @Date 2022/3/21 16:43
 * @Version 1.0
 */
public class homework {
    public static String triangleType(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Invalid Input";
        } else if (a + b > c && a + c > b && b + c > a) {
//            是三角形
            if (a == b && a == c) {
//                等边三角形
                return "Equilateral Triangle";
            }

            int[] edges = {a, b, c};
            Arrays.sort(edges);
            if (edges[0] * edges[0] + edges[1] * edges[1] == edges[2] * edges[2]) {
//                直角三角形
                return "Right Angle Triangle";
            }

            return "Other Triangle";
        } else {
            return "Not Triangle";
        }
    }

    public static double areaOfTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        } else if (a + b > c && a + c > b && b + c > a) {
//            是三角形
            double p = (a + b + c) / 2;
            return ((int)Math.sqrt(p * (p - a) * (p - b) * (p - c)*10000))/100.0;
        } else {
            return 0;
        }
    }
}
