import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BackPackTest {

	BackPack bp;

	@Before
	public void setUp() throws Exception {
		bp = new BackPack();
	}

	@Test
	public void test() {
		int m = 10;
		int n = 3;
		/*
		 * ������������������ֱ�Ϊ3�� 4�� 5����ֵ�ֱ�Ϊ4�� 5�� 6
		 */
		int w[] = { 3, 4, 5 };
		int p[] = { 4, 5, 6 };
		// ���÷���ִ��01,��ִ�н���浽c����
		int c[][] = bp.BackPack_Solution(m, n, w, p);
		// Ԥ�ڽ��
		int expected[][] = { { 0, 0, 4, 4, 4, 4, 4, 4, 4, 4 }, { 0, 0, 4, 5, 5, 5, 9, 9, 9, 9 },
				{ 0, 0, 4, 5, 6, 6, 9, 10, 11, 11 } };
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println("i: " + i + "	j: " + j + "	" + expected[i - 1][j - 1] + " " + c[i][j]);
				// ��һ�˶�
				assertEquals(expected[i - 1][j - 1], c[i][j]);
			}
		}

	}

}
