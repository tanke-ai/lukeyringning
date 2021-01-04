package com.bb.common.exception;

import com.bb.common.enums.ExceptionEnum;
import lombok.Getter;

@Getter
public class Bbexception extends RuntimeException {
    private int status;

    public Bbexception(ExceptionEnum em) {
        super(em.getMessage());
        this.status = em.getStatus();

    }

    public Bbexception(ExceptionEnum em, Throwable cause) {

        super(em.getMessage(), cause);
        this.status = em.getStatus();

    }


}
