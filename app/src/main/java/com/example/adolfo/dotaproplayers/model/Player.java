package com.example.adolfo.dotaproplayers.model;

import java.io.Serializable;


public class Player implements Serializable{

    private String account_id;
    private String steamid;
    private String avatar;
    private String avatarmedium;
    private String avatarfull;
    private String profileurl;
    private String personaname;
    private String last_login;
    private String full_history_time;
    private String cheese;
    private String fh_unavalible;
    private String loccountrycode;
    private String last_match_time;
    private String name;
    private String country_code;
    private String fantasy_role;
    private String team_id;
    private String team_name;
    private String team_tag;
    private String is_locked;
    private String is_pro;
    private String locked_until;


    public String getPersonaname() {
        return personaname;
    }
    public void setPersonaname(String personaname) {
        this.personaname = personaname;
    }
    public String getAccount_id() {
        return account_id;
    }
    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }
    public String getSteamid() {
        return steamid;
    }
    public void setSteamid(String steamid) {
        this.steamid = steamid;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getAvatarmedium() {
        return avatarmedium;
    }
    public void setAvatarmedium(String avatarmedium) {
        this.avatarmedium = avatarmedium;
    }
    public String getAvatarfull() {
        return avatarfull;
    }
    public void setAvatarfull(String avatarfull) {
        this.avatarfull = avatarfull;
    }
    public String getProfileurl() {
        return profileurl;
    }
    public void setProfileurl(String profileurl) {
        this.profileurl = profileurl;
    }
    public String getLast_login() {
        return last_login;
    }
    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }
    public String getFull_history_time() {
        return full_history_time;
    }
    public void setFull_history_time(String full_history_time) {
        this.full_history_time = full_history_time;
    }
    public String getCheese() {
        return cheese;
    }
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    public String getFh_unavalible() {
        return fh_unavalible;
    }
    public void setFh_unavalible(String fh_unavalible) {
        this.fh_unavalible = fh_unavalible;
    }
    public String getLoccountrycode() {
        return loccountrycode;
    }
    public void setLoccountrycode(String loccountrycode) {
        this.loccountrycode = loccountrycode;
    }
    public String getLast_match_time() {
        return last_match_time;
    }
    public void setLast_match_time(String last_match_time) {
        this.last_match_time = last_match_time;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry_code() {
        return country_code;
    }
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
    public String getFantasy_role() {
        return fantasy_role;
    }
    public void setFantasy_role(String fantasy_role) {
        this.fantasy_role = fantasy_role;
    }
    public String getTeam_id() {
        return team_id;
    }
    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }
    public String getTeam_name() {
        return team_name;
    }
    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
    public String getTeam_tag() {
        return team_tag;
    }
    public void setTeam_tag(String team_tag) {
        this.team_tag = team_tag;
    }
    public String getIs_locked() {
        return is_locked;
    }
    public void setIs_locked(String is_locked) {
        this.is_locked = is_locked;
    }
    public String getIs_pro() {
        return is_pro;
    }
    public void setIs_pro(String is_pro) {
        this.is_pro = is_pro;
    }
    public String getLocked_until() {
        return locked_until;
    }
    public void setLocked_until(String locked_until) {
        this.locked_until = locked_until;
    }
}
