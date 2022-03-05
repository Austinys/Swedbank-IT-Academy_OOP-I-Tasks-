package com.itacademy.java.oop.basics;

public enum ContractType {
    FULLTIME("FT"),
    PARTTIME("PT");


    public String contractType;

    ContractType(String contractType) {
        this.contractType = contractType;
    }

    public static ContractType valueOfCode(String contractType) {
        for (ContractType e : values()) {
            if (e.contractType.equals(contractType)) {
                return e;
            }
        }
        return null;
    }


}



