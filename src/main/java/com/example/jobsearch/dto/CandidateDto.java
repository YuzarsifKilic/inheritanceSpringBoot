package com.example.jobsearch.dto;

public class CandidateDto {

    private UserDto userDto;
    private String firstName;
    private String lastName;
    private int birthOfYear;
    private String phoneNumber;

    public CandidateDto() {}

    public CandidateDto(UserDto userDto, String firstName, String lastName, int birthOfYear, String phoneNumber) {
        this.userDto = userDto;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
        this.phoneNumber = phoneNumber;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }

    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
