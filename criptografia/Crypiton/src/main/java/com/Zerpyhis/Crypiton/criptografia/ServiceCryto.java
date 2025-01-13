package com.Zerpyhis.Crypiton.criptografia;

import org.jasypt.util.text.StrongTextEncryptor;

public class ServiceCryto {

    private static StrongTextEncryptor encryptor;

    static {
        encryptor = new StrongTextEncryptor();
        encryptor.setPassword(System.getenv("CHAVE_ACESSO"));
    }

    public static String encriptador(String texto ){
        return  encryptor.encrypt(texto);
    }

    public static String descritador(String texto ){
        return  encryptor.decrypt(texto);
    }


}
