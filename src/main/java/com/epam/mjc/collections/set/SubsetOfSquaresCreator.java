package com.epam.mjc.collections.set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        LinkedHashSet<Integer> resultSet = new LinkedHashSet<>();
        if(sourceList.size()>0){
            for (Integer integer : sourceList) {
                int x = integer * integer;
                if ((x) <= upperBound)
                    if (lowerBound <= (x)) {
                        resultSet.add(integer * integer);
                    }
            }
        }
        return resultSet;
    }
}
