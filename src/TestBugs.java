import java.util.Iterator;
import java.util.Vector;

public class TestBugs {
    protected Vector VectorUnion(Vector a,Vector b){
        Vector unionVector=new Vector(a);
        Iterator vb=b.iterator();
        while(vb.hasNext()){
            System.out.println("进入了循环");
            Object item=vb.next();
            unionVector.add(item);
        }
        return unionVector;
    }
    public static void main(String str[]){
        Vector a=new Vector();
        Vector b=new Vector();
        a.add(1);
        b.add(1);
        b.add(2);
        TestBugs test=new TestBugs();
        Vector unionVector=test.VectorUnion(a,b);
        for (int i=0 ; i < unionVector.size();i++)
        {
            System.out.println(unionVector.get(i));
        }
    }
}
