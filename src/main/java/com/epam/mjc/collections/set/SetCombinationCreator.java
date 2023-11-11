package com.epam.mjc.collections.set;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Sets.SetView<String> resultFirstSecond= Sets.intersection(new HashSet<>(firstSet), new HashSet<>(secondSet));

        Set<String> inThirdOnly = new HashSet<>(thirdSet);
        inThirdOnly .removeAll(resultFirstSecond);
        Set<String>finalResult= new HashSet<>();
        finalResult.addAll(resultFirstSecond);
        finalResult.addAll(inThirdOnly);
        return resultFirstSecond;
    }
}
