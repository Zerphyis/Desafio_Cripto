package com.Zerpyhis.Crypiton.transacao;

import com.Zerpyhis.Crypiton.criptografia.ServiceCryto;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cartao")
public class Cartao {

    @Transient
    ServiceCryto serviceCryto;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_document")
    private String encryptedUserDocument;

    @Column(name = "credit_card_token")
    private String encryptedCreditCardToken;

    @Column(name = "values_card")
    private Long values;

    @Transient
    private String userDocument;

    @Transient
    private String creditCardToken;

    public Cartao( ) {

    }

    public Cartao(DadosCartao cartao ) {
        this.userDocument = cartao.userDocument();
        this.creditCardToken = cartao.creditCardToken();
        this.values = cartao.values();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEncryptedUserDocument() {
        return encryptedUserDocument;
    }

    public String getEncryptedCreditCardToken() {
        return encryptedCreditCardToken;
    }

    public Long getValues() {
        return values;
    }

    public void setValues(Long values) {
        this.values = values;
    }

    public String getUserDocument() {
        return userDocument;
    }

    public void setUserDocument(String userDocument) {
        this.userDocument = userDocument;
    }

    public String getCreditCardToken() {
        return creditCardToken;
    }

    public void setCreditCardToken(String creditCardToken) {
        this.creditCardToken = creditCardToken;
    }

    @PrePersist
    public void encrypt() {
        if (userDocument != null) {
            this.encryptedUserDocument = ServiceCryto.encriptador(userDocument);
        }
        if (creditCardToken != null) {
            this.encryptedCreditCardToken = ServiceCryto.encriptador(creditCardToken);
        }
    }


    @PostLoad
    private void decrypt() {
        if (encryptedUserDocument != null) {
            this.userDocument = serviceCryto.descritador(encryptedUserDocument);
        }
        if (encryptedCreditCardToken != null) {
            this.creditCardToken = serviceCryto.descritador(encryptedCreditCardToken);
        }
    }
}
