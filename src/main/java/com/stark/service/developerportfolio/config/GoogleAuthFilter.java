package com.stark.service.developerportfolio.config;


import com.stark.service.developerportfolio.util.GoogleTokenAuthenticationUtil;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.GeneralSecurityException;

@Component
public class GoogleAuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String authToken = request.getHeader("Authorization").split(" ")[1];
        try {
            if(!GoogleTokenAuthenticationUtil.authenticateGoogleOauthToken(authToken)) {
                ((HttpServletResponse) servletResponse).sendError(HttpServletResponse.SC_UNAUTHORIZED, "The token is not valid.");
            }
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
    }

}
