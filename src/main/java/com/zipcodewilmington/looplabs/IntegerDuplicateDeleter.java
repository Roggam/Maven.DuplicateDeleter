package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).
                filter(value -> duplicateCounter(value) < maxNumberOfDuplications).
                toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).
                filter(value -> duplicateCounter(value) > exactNumberOfDuplications || duplicateCounter(value) < exactNumberOfDuplications).
                toArray(Integer[]::new);
    }

    public Integer duplicateCounter(Integer value){
        Integer counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(value == array[i]){
             counter++;
         }
        }
        return counter;
    }

}
