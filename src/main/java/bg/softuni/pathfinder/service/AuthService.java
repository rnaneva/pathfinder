package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.model.DTOs.UserRegisterDTO;
import bg.softuni.pathfinder.model.entities.Role;
import bg.softuni.pathfinder.model.entities.User;
import bg.softuni.pathfinder.model.entities.enums.Roles;
import bg.softuni.pathfinder.reporistory.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class AuthService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Autowired
    public AuthService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public void register(UserRegisterDTO userRegisterDTO){
        if(!userRegisterDTO.getPassword().equals(userRegisterDTO.getConfirmPassword())){
           throw new RuntimeException("passwords.match");
        }

        Optional<User> byEmail = this.userRepository.findByEmail(userRegisterDTO.getEmail());
        if(byEmail.isPresent()){
            throw new RuntimeException("email.used");
        }

        User user = modelMapper.map(userRegisterDTO, User.class);
        userRepository.save(user);

    }
}
