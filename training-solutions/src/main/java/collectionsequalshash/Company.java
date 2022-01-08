package collectionsequalshash;

import java.util.Objects;

public class Company {
    private String name;
    private String TaxNumber;

    public Company(String name, String taxNumber) {
        this.name = name;
        TaxNumber = taxNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return name.equals(company.name) && TaxNumber.equals(company.TaxNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, TaxNumber);
    }

    public String getName() {
        return name;
    }

    public String getTaxNumber() {
        return TaxNumber;
    }
}
