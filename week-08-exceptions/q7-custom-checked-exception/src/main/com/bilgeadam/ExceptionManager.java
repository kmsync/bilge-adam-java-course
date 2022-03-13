package com.bilgeadam;

import com.bilgeadam.exceptions.MultiplyException;

public class ExceptionManager {

    public void throwException() throws MultiplyException {
        throw new MultiplyException("Çarpım hatası oluştu.");
    }

}
