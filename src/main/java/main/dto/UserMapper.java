package main.dto;

import main.model.User;

public class UserMapper {
    public static DtoUser userMap(User user) {
        DtoUser dtoUser = new DtoUser();
        dtoUser.setId(user.getId());
        dtoUser.setUsername(user.getName());
        return dtoUser;
    }
}
