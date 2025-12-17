package LibraryManagementSystem.Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Member {
    Integer memberId;
    String name;
    String address;
    String phoneNumber;
    MemberType memberType;
    List<LoanItem> borrowedBooks = new ArrayList<>();

    public Member(Integer memberId, String name, String address, String phoneNumber, MemberType memberType) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.memberType = memberType;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }

    public List<LoanItem> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<LoanItem> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void addBorrowedBooks(Copy copy){
        LoanItem loanItem = new LoanItem(copy, LocalDateTime.now());


    }
}
