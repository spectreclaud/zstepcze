package com.topicFunctionalInterfaces.task1;

@FunctionalInterface
public interface Transform<T, S> {
    T transform(S s);
}
