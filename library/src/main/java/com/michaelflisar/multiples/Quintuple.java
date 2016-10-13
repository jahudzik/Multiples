package com.michaelflisar.multiples;

/**
 * Created by flisar on 13.10.2016.
 */

public class Quintuple<F, S, T, U, V> {
    public final F first;
    public final S second;
    public final T third;
    public final U forth;
    public final V fifth;

    public Quintuple(F first, S second, T third, U forth, V fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
        this.fifth = fifth;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Quintuple)) {
            return false;
        }
        Quintuple<?, ?, ?, ?, ?> p = (Quintuple<?, ?, ?, ?, ?>) o;
        return objectsEqual(p.first, first) && objectsEqual(p.second, second) && objectsEqual(p.third, third) && objectsEqual(p.forth, forth) && objectsEqual(p.fifth, fifth);
    }

    private static boolean objectsEqual(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    @Override
    public int hashCode() {
        return (first == null ? 0 : first.hashCode()) ^
                (second == null ? 0 : second.hashCode()) ^
                (third == null ? 0 : third.hashCode()) ^
                (forth == null ? 0 : forth.hashCode()) ^
                (fifth == null ? 0 : fifth.hashCode());
    }

    public static <A, B, C, D, E> Quintuple<A, B, C, D, E> create(A a, B b, C c, D d, E e) {
        return new Quintuple<A, B, C, D, E>(a, b, c, d, e);
    }
}