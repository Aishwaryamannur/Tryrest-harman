package repository;


import com.fasterxml.jackson.annotation.JsonTypeId;

@Entity
public class Address {

    @Id
    private Long addressId;

    @ManytoOne
    @JoinColum(name="userId",nullable=false)
    private User user;

    private String address1;
    private String country;


    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
