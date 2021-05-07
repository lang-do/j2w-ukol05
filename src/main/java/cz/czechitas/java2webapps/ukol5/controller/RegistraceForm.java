package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.EnumSet;

public class RegistraceForm {

    @NotNull
    private EnumSet<Sport> sport;

    @NotNull
    private Pohlavi pohlavi;

    @NotBlank
    private String jmeno;
    @NotBlank
    private String prijmeni;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate datumNarozeni;
    @NotNull
    private String turnus;
    @Email
    private String email;
    private String telefon;

    public RegistraceForm() {
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public String getTurnus() {
        return turnus;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public void setTurnus(String turnus) {
        this.turnus = turnus;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setPohlavi(Pohlavi pohlavi) {
        this.pohlavi = pohlavi;
    }
    public Pohlavi getPohlavi() {
        return pohlavi;
    }

    public void setSport(EnumSet<Sport> sport) {
        this.sport = sport;
    }
    public EnumSet<Sport> getSport() {
        return sport;
    }
}
