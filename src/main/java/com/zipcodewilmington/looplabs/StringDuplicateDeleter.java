package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).
                filter(value -> duplicateCounter(value) < maxNumberOfDuplications).
                toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).
                filter(value -> duplicateCounter(value) > exactNumberOfDuplications || duplicateCounter(value) < exactNumberOfDuplications).
                toArray(String[]::new);
    }

    public Integer duplicateCounter(String value){
        Integer counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(value.equals(array[i])){
                counter++;
            }
        }
        return counter;
    }
}
