package com.wangfengbabe.learning.generic_method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by wangfeng on 04/02/2017.
 */
public class TestGenericMethod {

  static <E> void fromArrayToCollection(E[] array, Collection<E> collection) {
    for (E item : array) {
      collection.add(item);
    }
  }

    /*public static <E> E copy(Collection<E> destination, Collection<? extends E> source) {
        E last = null;
        for (E e : source) {
            last = e;
            destination.add(e);
        }
        return last;

    }*/

  public static <E> E copy(Collection<? super E> dest, Collection<E> source) {
    E last = null;
    for (E element : source) {
      dest.add(element);
      last = element;
    }

    return last;
  }

  public static void main(String[] args) {
    Collection<Integer> ci = new ArrayList<Integer>();
    Integer[] ai = new Integer[20];
    fromArrayToCollection(ai, ci);

    Collection<String> cs = new LinkedHashSet<String>();
    String[] as = new String[100];
    fromArrayToCollection(as, cs);
  }
}
