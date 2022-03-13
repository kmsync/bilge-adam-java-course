package com.bilgeadam;

import com.bilgeadam.manager.CopyManager;

public class FileCopying{

    //TODO try catchlerde farklı bir yapı kullanın.
    public static void main(String[] args) {
        CopyManager copyManager = new CopyManager();
        System.out.println(copyManager.toString());
        FileRipper fileRipper = new FileRipper();
        copyManager.fileRipper(fileRipper);
    }
}
