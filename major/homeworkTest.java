package test;

import homework;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @Author Lang wenchong
 * @Date 2022/3/21 17:00
 * @Version 1.0
 */
public class homeworkTest {

    @Test
    public void testTriangleType() {
        Map<int[], String> testMap = new HashMap<int[], String>() {
            {
                put(new int[]{-1, -1, 2}, "Invalid Input");
                put(new int[]{0, 0, 0}, "Invalid Input");
                put(new int[]{4, 4, 8}, "Not Triangle");
                put(new int[]{10, 10, 25}, "Not Triangle");
                put(new int[]{6, 6, 6}, "Equilateral Triangle");
                put(new int[]{10, 10, 10}, "Equilateral Triangle");
                put(new int[]{3, 4, 5}, "Right Angle Triangle");
                put(new int[]{5, 12, 13}, "Right Angle Triangle");
                put(new int[]{6, 6, 7}, "Other Triangle");
                put(new int[]{3, 4, 6}, "Other Triangle");
            }

        };
        for (int[] arr : testMap.keySet()) {
            String ans = homework.triangleType(arr[0], arr[1], arr[2]);
            assertEquals(testMap.get(arr), ans);
        }
    }


    @Test
    public void testAreaOfTriangle() {
        Map<int[], Double> testMap = new HashMap<int[], Double>() {
            {
                put(new int[]{-1, -1, 2}, 0.00);
                put(new int[]{0, 0, 0}, 0.00);
                put(new int[]{4, 4, 8}, 0.00);
                put(new int[]{10, 10, 25}, 0.00);
                put(new int[]{6, 6, 6}, 15.58);
                put(new int[]{10, 10, 10}, 43.30);
                put(new int[]{3, 4, 5}, 6.00);
                put(new int[]{5, 12, 13}, 30.00);
                put(new int[]{6, 6, 7}, 17.05);
                put(new int[]{3, 4, 6}, 5.33);
            }
        };

        for (int[] arr : testMap.keySet()) {
            Double ans = homework.areaOfTriangle(arr[0], arr[1], arr[2]);
            assertEquals(testMap.get(arr), ans);
        }
    }
}
