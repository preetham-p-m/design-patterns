package create.builder.exact.helpers;

import java.time.LocalDate;
import java.time.Period;

import create.builder.exact.model.Address;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String address;
    private String age;
    private UserWebDTO userWebDTO;

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + ", " + address.getCity() + ", "
                + address.getState() + " - " + address.getPincode();
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate dateOfBirth) {
        Period age = Period.between(dateOfBirth, LocalDate.now());
        this.age = Integer.toString(age.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTO build() {
        this.userWebDTO = new UserWebDTO(firstName + " " + lastName, address, age);
        return this.userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        if (this.userWebDTO == null) {
            throw new NullPointerException("User not created");
        }

        return this.userWebDTO;
    }

}
