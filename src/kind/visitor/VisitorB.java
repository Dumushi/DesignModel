package kind.visitor;

/**
 *
 * Description:
 *         具体访问者
 * @author: mushi
 * @Date: 2021/2/22 16:41
 */
public class VisitorB implements Visitor {

    @Override
    public void visit(Element element) {
        System.out.println("访问者"+this.getClass().getSimpleName()+"----访问"+element.getClass().getSimpleName()+"："+element.opration());
    }
}
