package create.builder.common.helpers;

import java.time.LocalDate;
import java.time.Period;

import create.builder.exact.model.Address;

public class UserDTO {

    // #region Public and Private Properties
    private String name;
    private String address;
    private String age;
    // #endregion

    // #region Getters, Setters, toString
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address;
    }
    // #endregion

    // #region Builder method
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }
    // #endregion

    // #region Builder Class
    public static class UserDTOBuilder {

        private String firstName;
        private String lastName;
        private String address;
        private String age;
        private UserDTO userWebDTO;

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet() + ", " + address.getCity() + ", "
                    + address.getState() + " - " + address.getPincode();
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate dateOfBirth) {
            Period age = Period.between(dateOfBirth, LocalDate.now());
            this.age = Integer.toString(age.getYears());
            return this;
        }

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTO build() {
            this.userWebDTO = new UserDTO();
            this.userWebDTO.setName(this.firstName + " " + this.lastName);
            this.userWebDTO.setAge(this.age);
            this.userWebDTO.setAddress(this.address);
            return this.userWebDTO;
        }

        public UserDTO getUserDTO() {
            if (this.userWebDTO == null) {
                throw new NullPointerException("User not created");
            }

            return this.userWebDTO;
        }

    }
    // #endregion
}
