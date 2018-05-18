/**
 * ST
 * 
 * 符号表基础数据结构实现的API
 */
public class ST<Key,Value> {
    ST(){

    }

    void put(Key key, Value value){
        if(value == null) {
            delete(key);
            return;
        }
    }

    Value get(Key key){
        
    }

    void delete(Key key){
        put(key, null);
    }

    boolean contains(Key key){
        return get(key) != null;
    }

    boolean isEmpty(){
        return size() == 0;
    }

    int size(){

    }

    Iterable<Key> keys(){

    }
    
}