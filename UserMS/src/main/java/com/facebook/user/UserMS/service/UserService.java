package com.facebook.user.UserMS.service;


import java.util.List;

import com.facebook.user.UserMS.dto.LoginDTO;
import com.facebook.user.UserMS.dto.UserDTO;
import com.facebook.user.UserMS.exception.FacebookException;



public interface UserService {
    long getNextSequenceId(String key) throws FacebookException;
    public Long registerUser(UserDTO userDTO) throws FacebookException;
    public Long loginUser(LoginDTO loginDTO)throws FacebookException;
    public void resetPassword(LoginDTO loginDTO) throws FacebookException;
    public void updateUser(UserDTO profileDTO) throws FacebookException;
    String getUsername(Long userId) throws FacebookException;
    Long getUserId(String username) throws FacebookException;
    UserDTO getUser(Long id) throws FacebookException;
    List<UserDTO> getAllUsers();
    UserDTO[] searchUsers(String searchInput);
}