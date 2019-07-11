package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if(left <= right){
            List<Integer> list = IntStream.rangeClosed(left,right).boxed().collect(Collectors.toList());
            return list;
        }
        else{
            List<Integer> list = IntStream.rangeClosed(right,left).boxed().collect(Collectors.toList());
            list.sort(Comparator.reverseOrder());
            return list;
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        return (left>right)?IntStream.rangeClosed(right,left).boxed().sorted(Comparator.reverseOrder()).filter(i->i%2==0).collect(Collectors.toList()) :
                IntStream.rangeClosed(left,right).boxed().filter(i->i%2==0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(i->i%2==0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
