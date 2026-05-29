package com.promt2app.distributed.account_service.service;


import com.promt2app.distributed.account_service.dto.auth.AuthResponse;
import com.promt2app.distributed.account_service.dto.auth.LoginRequest;
import com.promt2app.distributed.account_service.dto.auth.SignupRequest;

public interface AuthService {
  AuthResponse signup(SignupRequest request);

  AuthResponse login(LoginRequest request);
}
