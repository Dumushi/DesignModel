package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * Description:
 *          生成验证码
 * @author: mushi
 * @Date: 2021/2/6 9:31
 */
public class CheckCode {

    /**验证码*/
    private String check = "";
    List<Integer> reuse = new ArrayList<>();

    char[] charCode = {'1','2','3','4','5','6','7','8','9','0','a','b',
                        'c','d','e','f','g','h','i','j','k','l','m','n',
                        'o','p','q','r','s','t','u','v','w','x','y','z',
                        'A','B','C','D','E','F','G','H','I','J','K','L',
                        'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    /**num:验证码位数*/
    public String getCheckCode(int num){

        char[] result = new char[num];

        for (int k = 0;k<num;k++){
            int j = new Random().nextInt(62);
            char en = charCode[j];
            int randow = getRandow(num);
            result[randow] = en;
        }
        for (int i = 0;i<result.length;i++){
            check += String.valueOf(result[i]);
        }

        return check;
    }

    /**排位*/
    public int getRandow(int round){
        int cheakNum = new Random().nextInt(round);
        if (!reuse.contains(cheakNum)){
            reuse.add(cheakNum);
        }else{
            return this.getRandow(round);
        }
        return cheakNum;
    }

}
