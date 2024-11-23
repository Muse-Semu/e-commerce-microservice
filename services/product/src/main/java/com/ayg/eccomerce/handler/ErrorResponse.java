package com.ayg.eccomerce.handler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
