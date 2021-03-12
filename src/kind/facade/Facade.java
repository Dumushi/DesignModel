package kind.facade;

/**
 *
 * Description:
 *          外观角色
 * @author: mushi
 * @Date: 2021/2/6 11:41
 */
public class Facade {

    private SubSystem01 subSystem01;
    private SubSystem02 subSystem02;

    public void method(){
        //调用子系统功能
        subSystem01.sys01();
        subSystem02.sys02();
    }

}
