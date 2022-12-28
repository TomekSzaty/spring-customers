package com.tomek;

public record NewCustomerRequest(
        String name,
        String email,
        Integer age
) {

}
