package create.builder.common;

import java.time.LocalDate;

import create.builder.common.helpers.UserDTO;
import create.builder.common.helpers.UserDTO.UserDTOBuilder;
import create.builder.exact.model.Address;
import create.builder.exact.model.User;

public class BuilderMain {
    public static void main(String[] args) {
        User user = createUser();

        UserDTO userDTO = directBuild(UserDTO.getBuilder(), user);
        System.out.println(userDTO);
    }

    // Director
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withBirthday(user.getDateOfBirth())
                .withAddress(user.getAddress()).build();
    }

    // #region Create User
    public static User createUser() {
        Address address = new Address();
        address.setHouseNumber("House Name");
        address.setStreet("Street");
        address.setCity("City");
        address.setState("State");
        address.setPincode("123456");

        User user = new User();
        user.setDateOfBirth(LocalDate.of(2000, 10, 25));
        user.setFirstName("Preetham");
        user.setLastName("P M");
        user.setAddress(address);

        return user;
    }
    // #endregion
}
