package demo;

/**
 *
 * Description:
 *
 * @author: mushi
 * @Date: 2021/2/6 9:58
 */
public class Test {

    public static void main(String[] args) {
        CheckCode checkCode = new CheckCode();
        String code = checkCode.getCheckCode(6);
        System.out.println(code);
    }

}
