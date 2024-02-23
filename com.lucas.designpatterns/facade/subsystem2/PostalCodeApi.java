package facade.subsystem2;

import singleton.LazySingleton;

public class PostalCodeApi {
    private static PostalCodeApi instance = new PostalCodeApi();

    private PostalCodeApi(){
        super();
    }

    public static PostalCodeApi getInstance() {
        return instance;
    }

    public String getCity(String postalCode) {
        return "Foz do Iguaçu";
    }

    public String getState(String postalCode) {
        return "Paraná";
    }
}
