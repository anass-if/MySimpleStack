package dcll.aifr.MySimpleStack;

/**
 * Created by Anass on 06/03/2015.
 */
public class Item {

    private Object value;

     Item(final Object value) {
        setValue(value);
    }

    public Object getValue(){
        return value ;
    }
    public void  setValue(Object value){
        this.value = value ;
    }
}
