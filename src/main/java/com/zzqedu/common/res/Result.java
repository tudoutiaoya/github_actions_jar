package com.zzqedu.common.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int code;
    private String message;
    private Object data;

    public static Result success(Object data) {
        return new Result(0, "success", data);
    }
}
