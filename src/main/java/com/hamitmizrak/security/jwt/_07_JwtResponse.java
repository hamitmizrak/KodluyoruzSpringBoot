package com.hamitmizrak.security.jwt;

import java.io.Serializable;

public class _07_JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;

    private final String jwttoken;

    //parametreli constructor
    public _07_JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    //getter
    public String getToken() {
        return this.jwttoken;
    }
}
