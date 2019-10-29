/**
 * Created by Lucia Alonso TP2 Deco-Geco M1 IHM UT3 .
 */

package deqo.lalo.mysimplestack;

public class Item {
    private Object object;

    public Item(Object obj){
        this.object = obj;
    }

    public void setNum(Object obj) {
        this.object = obj;
    }

    public Object getNum() {
        return object;
    }

}
