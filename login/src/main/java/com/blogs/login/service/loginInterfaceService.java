package com.blogs.login.service;

import com.blogs.login.model.login;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface loginInterfaceService {

    public List<login> searchLogin();

    public login addRegister(login model);

    public Map<String, String> getToken(login model);
}
