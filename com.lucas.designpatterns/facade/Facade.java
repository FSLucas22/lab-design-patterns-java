package facade;

import facade.subsystem1.CrmService;
import facade.subsystem2.PostalCodeApi;

public class Facade {
    public void migrateClient(String name, String postalCode) {
        var api = PostalCodeApi.getInstance();
        String city = api.getCity(postalCode);
        String state = api.getState(postalCode);

        CrmService.updateClient(name, postalCode, city, state);
    }
}
