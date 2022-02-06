package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;
import org.aspectj.weaver.ast.Not;

public class NotFoundExcpeption extends RuntimeException{

    public NotFoundExcpeption(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
