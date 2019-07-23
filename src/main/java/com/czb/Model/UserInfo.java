package com.czb.Model;

import java.math.BigDecimal;

public class UserInfo {
    private String idCard;

    private String userName;

    private String password;

    private String mobilephone;

    private String email;

    private String bindAcctBanknum;

    private String goldHoldAmount;

    private BigDecimal balance;

    private String addTime;

    private String lastLoginTime;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBindAcctBanknum() {
        return bindAcctBanknum;
    }

    public void setBindAcctBanknum(String bindAcctBanknum) {
        this.bindAcctBanknum = bindAcctBanknum == null ? null : bindAcctBanknum.trim();
    }

    public String getGoldHoldAmount() {
        return goldHoldAmount;
    }

    public void setGoldHoldAmount(String goldHoldAmount) {
        this.goldHoldAmount = goldHoldAmount == null ? null : goldHoldAmount.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime == null ? null : lastLoginTime.trim();
    }
}