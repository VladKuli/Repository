package org.store.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;


public class User {

    private Long id;
    private String login;
    private String password;
}