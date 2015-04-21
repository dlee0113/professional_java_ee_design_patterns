package com.devchronicles.mvc.javaee;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class ListUsersAction {

    private List<String> userList = new ArrayList<>();

        public List<String> getUserList() {
        return userList;
    }

    public String execute() {
        userList.add("John Lennon");
        userList.add("Ringo Starr");
        userList.add("Paul McCartney");
        userList.add("George Harrison");
        return "/WEB-INF/pages/listusers.xhtml";
    }
}
