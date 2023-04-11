package com.hithachi;

import java.util.Objects;

public class Customer {
    private Integer id;
    private Integer age;
    private String email;
    private String name;

    public Customer(Integer id,
                    Integer age,
                    String email,
                    String name) {
        this.id = id;
        this.age = age;
        this.email = email;
        this.name = name;
    }

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(age, customer.age) && Objects.equals(email, customer.email) && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, email, name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}