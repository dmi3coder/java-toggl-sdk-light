package io.github.dmitrychaban.java_toggl_sdk_light;

import io.github.dmitrychaban.java_toggl_sdk_light.model.UserContext;
import io.github.dmitrychaban.java_toggl_sdk_light.model.remote.ResponseWrapper;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

import javax.validation.constraints.NotNull;
import java.util.Base64;

public class TogglApiBuilder {
    private TogglApiBuilder self;
    private String token;

    public TogglApiBuilder() {
    }

    public static TogglApiBuilder with(@NotNull String token) {
        return new TogglApiBuilder().withToken(token);
    }

    public TogglApiBuilder withToken(@NotNull String token) {
        this.token = token;
        return this;
    }

    public TogglApi build() {
        WebClient client = WebClient.create("https://www.toggl.com/api/v8");
        String headerTokenValue = token + ":api_token";
        String encodedHeaderTokenValue = new String(Base64.getEncoder().encode(headerTokenValue.getBytes()));
        Mono<UserContext> context = client.get()
                .uri("/me").accept(MediaType.APPLICATION_JSON)
                .header("Authorization", "Basic "+encodedHeaderTokenValue)
                .retrieve()
                .bodyToMono(ResponseWrapper.class).map(ResponseWrapper::getData);
        return new DefaultTogglApi(context);
    }

}
