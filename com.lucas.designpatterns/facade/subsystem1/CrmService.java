package facade.subsystem1;

public class CrmService {
    public static void updateClient(String name, String postalCode, String city, String state) {
        System.out.println("Client saved in the CRM System");
        System.out.format("Client{name=%s, postalCode=%s, city=%s, state=%s}",
                name,
                postalCode,
                city,
                state);
    }
}
