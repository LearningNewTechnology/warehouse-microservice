package com.project.warehouse.factory;

import com.project.warehouse.model.Account;
import com.project.warehouse.model.Address;
import com.project.warehouse.model.Phone;

import java.util.Date;


//@Configurable
public class AccountBuilder {

    private Account account;

    private  AccountBuilder(){}

    private void setAccount(Account account) {
        this.account = account;
    }

    public static AccountBuilder newAccountBuilder(){
        AccountBuilder accountBuilder = new AccountBuilder();
        accountBuilder.setAccount(new Account());
        return accountBuilder;
    }

    public AccountBuilder userName(String userName){
        this.account.setUserName(userName);
        return this;
    }

    public AccountBuilder password(String password){
        this.account.setPassword(password);
        return this;
    }

    public AccountBuilder mail(String mail){
        this.account.setMail(mail);
        return this;
    }

    public AccountBuilder role(String role){
        this.account.setRole(role);
        return this;
    }

    public AccountBuilder taxCode(String taxCode){
        this.account.setTaxCode(taxCode);
        return this;
    }

    public AccountBuilder firstName(String firstName){
        this.account.setFirstName(firstName);
        return this;
    }

    public AccountBuilder lastName(String lastName){
        this.account.setLastName(lastName);
        return this;
    }

    public AccountBuilder birthDate(Date birthDate){
        this.account.setBirthDate(birthDate);
        return this;
    }

    public AccountBuilder withAddrees(String street, String streenNumber, String zip, String country, String region, String city){
        Address address = new Address();
        address.setStreet(street);
        address.setStreenNumber(streenNumber);
        address.setZip(zip);
        address.setCountry(country);
        address.setRegion(region);
        address.setCity(city);
        this.account.setAddress(address);
        return this;
    }

    public AccountBuilder withTelephoneNumber(String countryPrefix, String prefix, String telephone){
        Phone telephoneNumber = new Phone();
        telephoneNumber.setCountryPrefix(countryPrefix);
        telephoneNumber.setPrefix(prefix);
        telephoneNumber.setTelephone(telephone);

        this.account.setTelephoneNumber(telephoneNumber);
        return this;
    }

    public Account build(){
        return this.account;
    }
}
