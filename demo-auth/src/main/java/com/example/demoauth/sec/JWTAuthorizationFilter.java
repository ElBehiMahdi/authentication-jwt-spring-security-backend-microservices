package com.example.demoauth.sec;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTAuthorizationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("***************************");
        /*

         */
        String jwt=httpServletRequest.getHeader("Authorization");
        if(jwt == null) throw new RuntimeException("Not Authorized");
        /*

         */
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
