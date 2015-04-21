package com.devchronicles.mvc.plain;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListUsersAction implements Action {
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        List<String> userList = new ArrayList<>();
        userList.add("John Lennon");
        userList.add("Ringo Starr");
        userList.add("Paul McCartney");
        userList.add("George Harrison");
        request.setAttribute("listusers", userList);
        return "/WEB-INF/pages/listusers.jsp";
    }
}
