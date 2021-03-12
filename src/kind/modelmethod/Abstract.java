package kind.modelmethod;

public abstract class Abstract {

    /**模板方法*/
    public void Template(){
        specificMethod();
        abstractMethod01();
        abstractMethod02();
        //子类通过控制hookMethod2的返回值可以控制父类的行为
        if (hookMethod2()){
            hookMethod1();
        }
    }

    /**具体方法*/
    public void specificMethod(){
        System.out.println("抽象类中已经实现的方法，子类可以继承和重写");
    }

    /**钩子方法*/
    public void hookMethod1(){}

    /**钩子方法*/
    public boolean hookMethod2(){
        return true;
    }

    /**抽象方法*/
    public abstract void abstractMethod01();

    /**抽象方法*/
    public abstract void abstractMethod02();

}
