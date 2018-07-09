package com.migu.legacycode.chapter25.a;

public class FakeParameterSource implements ParameterSource {

    @Override
    public String getParameterForName(String name) {
        return "FakeParameterSource";
    }
}
