package com.example.rahul.flightbot.model;

/**
 * Created by Rahul on 13-06-2016.
 */
public class CurrencyWraper {
    private String Code;
    private String Symbol;
    private String ThousandSeparator;
    private String DecimalSeparator;
    private boolean SymbolOnLeft;
    private boolean SpaceBetweenAmountAndSymbol;
    private int RoundingCofficient;
    private int DecimalDigits;

    public CurrencyWraper(String code, String symbol, String thousandSeparator, String decimalSeparator, boolean symbolOnLeft, boolean spaceBetweenAmountAndSymbol, int roundingCofficient, int decimalDigits) {
        Code = code;
        Symbol = symbol;
        ThousandSeparator = thousandSeparator;
        DecimalSeparator = decimalSeparator;
        SymbolOnLeft = symbolOnLeft;
        SpaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol;
        RoundingCofficient = roundingCofficient;
        DecimalDigits = decimalDigits;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getThousandSeparator() {
        return ThousandSeparator;
    }

    public void setThousandSeparator(String thousandSeparator) {
        ThousandSeparator = thousandSeparator;
    }

    public String getDecimalSeparator() {
        return DecimalSeparator;
    }

    public void setDecimalSeparator(String decimalSeparator) {
        DecimalSeparator = decimalSeparator;
    }

    public boolean isSymbolOnLeft() {
        return SymbolOnLeft;
    }

    public void setSymbolOnLeft(boolean symbolOnLeft) {
        SymbolOnLeft = symbolOnLeft;
    }

    public boolean isSpaceBetweenAmountAndSymbol() {
        return SpaceBetweenAmountAndSymbol;
    }

    public void setSpaceBetweenAmountAndSymbol(boolean spaceBetweenAmountAndSymbol) {
        SpaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol;
    }

    public int getRoundingCofficient() {
        return RoundingCofficient;
    }

    public void setRoundingCofficient(int roundingCofficient) {
        RoundingCofficient = roundingCofficient;
    }

    public int getDecimalDigits() {
        return DecimalDigits;
    }

    public void setDecimalDigits(int decimalDigits) {
        DecimalDigits = decimalDigits;
    }
}
