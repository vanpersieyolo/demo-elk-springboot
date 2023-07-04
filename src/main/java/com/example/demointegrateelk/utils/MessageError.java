package com.example.demointegrateelk.utils;

public record MessageError(String code, String msg) {
    //Message Error
    public static final MessageError SERVER_ERROR = new MessageError("000000", "ERROR_OCCURS_DUE_TO_INVOKE_API");
    public static final MessageError AUTH_ERROR = new MessageError("000001", "AUTHENTICATION_FAILED");
    public static final MessageError REQUEST_INVALID = new MessageError("000002", "REQUEST_INVALID");
    public static final MessageError PARSE_INVALID = new MessageError("000003", "PARSE_INVALID");
    public static final MessageError ACCESS_DENIED = new MessageError("000004", "ACCESS_DENIED");
    public static final MessageError SIGNATURE_ERROR = new MessageError("000005", "SIGNATURE_ERROR");
    public static final MessageError JWT_INVALID_ERROR = new MessageError("000006", "JWT_INVALID_ERROR");
    public static final MessageError EXPIRED_JWT_ERROR = new MessageError("000007", "EXPIRED_JWT_ERROR");
    public static final MessageError UNSUPPORTED_JWT_ERROR = new MessageError("000008", "UNSUPPORTED_JWT_ERROR");
    public static final MessageError JWT_CLAIMS_IS_EMPTY_ERROR = new MessageError("000009", "JWT_CLAIMS_IS_EMPTY_ERROR");
    public static final MessageError SYNTAX_ERROR_FOR_BACKEND = new MessageError("000010", "SYNTAX_ERROR_FOR_BACKEND");
    public static final MessageError NULL_POINTER_ERROR = new MessageError("000011", "NULL_POINTER_ERROR");
    public static final MessageError REFRESH_TOKEN_INVALID = new MessageError("000012", "REFRESH_TOKEN_INVALID");
    public static final MessageError PARSE_FAILURE = new MessageError("000013", "PARSE_FAILURE");
    public static final MessageError NOT_FOUND = new MessageError("000014", "NOT_FOUND");

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}