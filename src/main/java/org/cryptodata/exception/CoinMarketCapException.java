package org.cryptodata.exception;

public class CoinMarketCapException extends Exception {

    private final Long errorCode;

    /**
     * Constructs a CoinMarketCapException with an error message.
     *
     * @param message The error message.
     */
    public CoinMarketCapException(String message) {
        super(message);
        this.errorCode = null;
    }

    /**
     * Constructs a CoinMarketCapException with an error code and message.
     *
     * @param errorCode The error code.
     * @param message   The error message.
     */
    public CoinMarketCapException(Long errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public CoinMarketCapException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = null;
    }

    /**
     * Gets the error code associated with the exception.
     *
     * @return The error code, or null if not available.
     */
    public Long getErrorCode() {
        return errorCode;
    }
}
