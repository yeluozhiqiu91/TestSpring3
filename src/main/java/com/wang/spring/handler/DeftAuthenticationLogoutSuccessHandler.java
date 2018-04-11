package com.wang.spring.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeftAuthenticationLogoutSuccessHandler implements LogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        String redirect;

        String uri = request.getRequestURI();
        if (uri != null && uri.indexOf("/") != -1) {
            redirect = uri.substring(0, uri.indexOf("/"));
        } else {
            redirect = "/";
        }

        String returnPath = request.getParameter("returnPath");
        if (returnPath != null) {
            redirect += returnPath;
        }

        if(redirect == null || redirect.trim().isEmpty())
            redirect = request.getContextPath();

        response.sendRedirect(redirect);
    }

}
