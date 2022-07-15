package ru.learnup.learnup.spring.mvc.homework29.mapper;

import org.springframework.stereotype.Component;
import ru.learnup.learnup.spring.mvc.homework29.entity.User;
import ru.learnup.learnup.spring.mvc.homework29.model.UserDto;
import ru.learnup.learnup.spring.mvc.homework29.view.UserView;

@Component
public class UserMapper {

    public UserDto mapToDto(User entity) {
        return UserDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .surname(entity.getSurname())
                .patronymic(entity.getPatronymic())
                .birthday(entity.getBirthday())
                .email(entity.getEmail())
                .build();
    }

    public User mapToEntity(UserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setPatronymic(dto.getPatronymic());
        user.setBirthday(dto.getBirthday());
        user.setEmail(dto.getEmail());
        return user;
    }

    public UserView mapToView(UserDto dto) {
        UserView view = new UserView();
        view.setId(dto.getId());
        view.setName(dto.getName());
        view.setSurname(dto.getSurname());
        view.setPatronymic(dto.getPatronymic());
        view.setBirthday(dto.getBirthday());
        view.setEmail(dto.getEmail());
        return view;
    }

    public UserDto mapFromView(UserView view) {
        return UserDto.builder()
                .id(view.getId())
                .name(view.getName())
                .surname(view.getSurname())
                .patronymic(view.getPatronymic())
                .birthday(view.getBirthday())
                .email(view.getEmail())
                .build();
    }

}
