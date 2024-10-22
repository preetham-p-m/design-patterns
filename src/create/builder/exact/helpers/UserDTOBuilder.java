package create.builder.exact.helpers;

import java.time.LocalDate;

import create.builder.exact.model.Address;

public interface UserDTOBuilder {

    UserDTOBuilder withAddress(Address address);

    UserDTOBuilder withBirthday(LocalDate dateOfBirth);

    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withLastName(String lastName);

    UserDTO build();

    UserDTO getUserDTO();
}
