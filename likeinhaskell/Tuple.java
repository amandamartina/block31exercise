package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
public class Tuple <A, B> { //en parklass (ett par av typade värden)
    private final A first;
    private final B second;

    public Tuple (A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A fst(){
        return first;
    }

    public B snd(){
        return second;
    }
}