package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"testowanierazdwatrzytestowanierazdwatrzytestowanierazdwatrzytestowanierazdwatrzy", "TEST-NUMER4",
            "925839543", "aga_test_1", "test.jakis-46", "...", "___"})
    public void shouldReturnTrueIfValidUserName(String input) {
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"bRodWsart4!", "htrews$", "t", "4", "_."})
    public void shouldReturnFalseIfInvalidUserName(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfEmptyUserName(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"a.bozena@domena.com", "a_boz45@domena.p", "aBoz-enA0@domenaPODWOJNA.comDEP", "545678.tu-_ad@HOHOH.de",
            "a.bozena@dom-ena.come", "a.bozena@dom.ena.comit", "abo.ze.na@zabre.com", "abozena@za.br.e.com",
            "testowanierazdwatrzytestowanierazdwatrzytestowanierazdwatrzytestowanierazdwatrzy@testowanierazdwatrzytestowanierazdwatrzytestowanierazdwatrzytestowanierazdwatrzy.pl"})
    public void shouldReturnTrueIfValidEmailAddress(String input) {
        assertTrue(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"agaboz#hohoh.pl", "a!bozena@zabre.com", "abozena@zab_re.com", "abozena@zabre.combination",
            "abozena@zabre.co4", "abozena@zabre.co*", "abozena@za%bre.com"})
    public void shouldReturnFalseIfInvalidEmailAddress(String input) {
        assertFalse(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfEmptyEmail(String input) {
        assertTrue(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String input) {
        assertFalse(userValidator.validateEmail(input));
    }
}