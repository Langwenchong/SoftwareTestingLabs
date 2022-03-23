package test;

import main.homework;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Author Lang wenchong
 * @Date 2022/3/16 11:58
 * @Version 1.0
 */

@RunWith(Parameterized.class)
public class homeworkTest {

    @Parameterized.Parameter(0)
    public int input;

    @Parameterized.Parameter(1)
    public int expectedResult;


    @Parameterized.Parameters(name = "{index} <==> input={0} expectedResult={1}")
    public static Collection<Integer[]> data() throws IOException {
        InputStreamReader inputStreamReader = null;
        File f = new File("D:/Javacode/lab2/src/resources/testinput.txt");
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Integer[]> list = new ArrayList<>();
        BufferedReader in = new BufferedReader(inputStreamReader);
        String tmp = "";
        tmp = in.readLine();
        while (tmp != null && !tmp.equals("")) {
            String[] arr = tmp.split(",");
            Integer[] item = {Integer.parseInt(arr[0]), Integer.parseInt(arr[1])};
            list.add(item);
            tmp = in.readLine();
        }
        System.out.println(list.size());
        return list;
    }

    public homework h;

    @BeforeClass
    public static void BeforeClass() {
        System.out.println("trigger @BeforeClass function!");
    }

    @Before
    public void Before() throws Exception {
        h = new homework();
        System.out.println("trigger @Before function!");
    }

    @Test
    public void test1() {
        System.out.println("trigger @Test function!");
        assertEquals(12, h.solve(7));
    }

    @Test
    public void test2() {
        System.out.println("trigger @Test function!");
        assertEquals(108, h.solve(13));
    }

    @Test
    public void test() {
        assertEquals(expectedResult, h.solve(input));
    }

    @After
    public void After() {
        System.out.println("trigger @After function!");
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("trigger @AfterClass function!");
    }

}
