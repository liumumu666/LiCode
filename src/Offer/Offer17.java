package Offer;

/**
 * @author LiuMuMu
 * @date 2020/12/17 19:57
 * @projectName LiCode
 */
public class Offer17 {

        public int[] printNumbers(int n) {
            int end = (int)Math.pow(10, n) - 1;
            int[] res = new int[end];
            for(int i = 0; i < end; i++)
                res[i] = i + 1;
            return res;
        }

}
