package Code;

/**
 * @author LiuMuMu
 * @date 2020/12/3 21:55
 * @projectName LiCode
 */
public class code204 {
    /**
     * 统计所有小于非负整数n的质数的数量。
     * 示例 1：
     * 输入：n = 10
     * 输出：4
     * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
     * 示例 2：
     * 输入：n = 0
     * 输出：0
     * 示例 3：
     * 输入：n = 1
     * 输出：0
     */
    /**
     * https://leetcode-cn.com/problems/count-primes/solution/ji-shu-zhi-shu-by-leetcode-solution/
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    public boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }




    public static void main(String[] args) {
        code204 code204 = new code204();
        System.out.println(code204.countPrimes(2));
    }
}
