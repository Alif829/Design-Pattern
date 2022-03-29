package builder;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        //Client has to provide director with concrete builder
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    /**
     * This method serves the role of director in builder pattern.
     */
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    /**
     ** sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1998, 8, 10));
        user.setFirstName("Lutfar");
        user.setLastName("Alif");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("Kapasia");
        address.setCity("Gazipur");
        address.setState("Dhaka");
        address.setZipcode("1730");
        user.setAddress(address);
        return user;
    }
}
