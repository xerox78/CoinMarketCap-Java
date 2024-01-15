package org.cryptodata.exception;

public class CoinMarketCapException extends Exception {

    public CoinMarketCapException(String message, Throwable cause) {
        super(message, cause);
    }
    public CoinMarketCapException(Long errorCode, String errorMessage) {
        super("Error Code = " + errorCode + ", message = " + errorMessage);
    }
    public CoinMarketCapException(String message) {
        super(message);
    }
}
