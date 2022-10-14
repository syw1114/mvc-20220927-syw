package com.study.mvc20220927syw.builder;

import lombok.Data;

@Data
public class User {

    private String username;

    private String password;

    private String email;

    private String name;

    public static UserBuilder userBuilder(){
        return new UserBuilder();
    }

    //생성자 생성.
    public User(UserBuilder userBuilder) {
        this.username = userBuilder.username;
        this.password = userBuilder.password;
        this.email = userBuilder.email;
        this.name = userBuilder.name;
    }

    //내부클래스 , static 공유되는영역.
    public static class UserBuilder {

        private String username;

        private String password;

        private String email;

        private String name;

        public static UserBuilder UserBuilder(){
            return new UserBuilder();
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }
        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public User build(){
            return new User(this);

        }
    }

}
