package Zadanie7;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;

class ApiUnavailableException extends RuntimeException {
    ApiUnavailableException(Throwable cause) {
        super(cause);
    }

}
class TimeUnavailableException extends ApiUnavailableException{
    TimeUnavailableException(Throwable cause) {
        super(cause);
    }

}

interface ApiClient {
    Response get(String path);
}

class RetryingCaller {
    Response getWithRetry(ApiClient api, String path) throws InterruptedException {
        for (int attempt = 1; ; attempt++) {
            try {
                return api.get(path);
            } catch (ApiUnavailableException e) {
                if (attempt == 3) throw e;
                Thread.sleep(1000);
            }
        }
    }
}

class RestAssuredApiClient implements ApiClient {
    public Response get(String path) {
        try {
            return Http.get(path);
        } catch (ConnectException | SocketTimeoutException e) {
            throw new ApiUnavailableException(e);
        }
    }
}

class OkHttpApiClient implements ApiClient {
    public Response get(String path) {
        try {
            return Http.get(path);
        } catch (IOException e) {
            throw new TimeUnavailableException(e);
        }
    }
}

class Response {

}

class Http {
    static Response get(String path) throws ConnectException,SocketTimeoutException {
        return null;
    }
}