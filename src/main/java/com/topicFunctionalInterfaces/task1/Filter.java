package com.topicFunctionalInterfaces.task1;

@FunctionalInterface
public interface Filter<S> {
    boolean check(S s);
}
