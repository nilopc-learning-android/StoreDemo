package com.nytimes.storedemo.model;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public abstract class Data {
    public abstract List<Children> children();
}
