package Java_10.ushtrime;

public class KlasaAbstrakte implements Comparable<String>, Cloneable{

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public KlasaAbstrakte clone() throws CloneNotSupportedException {
        KlasaAbstrakte clone = (KlasaAbstrakte) super.clone();
        return null;
    }
}


interface MyComparable<T> {
    int compareTo(T other);
}
