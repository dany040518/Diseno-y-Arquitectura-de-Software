package edu.unisabana.dyas.tdd.registry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Registry {
    private final List<Integer> registeredIds = new ArrayList<>();
    public RegisterResult registerVoter(Person p) {
        // TODO Validate person and return real result.
        if (!p.isAlive()) {
            return RegisterResult.DEAD;
        }
        if (p.getAge() < 18) {
            return RegisterResult.UNDERAGE;
        }
        if (p.getAge() > 100) {
            return RegisterResult.INVALID_AGE;
        }
        if (registeredIds.contains(p.getId())) {
            return RegisterResult.DUPLICATED;
        }
        registeredIds.add(p.getId());
        return RegisterResult.VALID;
    }
}
