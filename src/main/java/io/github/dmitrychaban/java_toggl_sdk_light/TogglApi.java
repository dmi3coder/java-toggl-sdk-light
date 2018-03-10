package io.github.dmitrychaban.java_toggl_sdk_light;


import io.github.dmitrychaban.java_toggl_sdk_light.model.UserContext;
import reactor.core.publisher.Mono;

public class TogglApi {
    private Mono<UserContext> context;

    public TogglApi(Mono<UserContext> context) {
        this.context = context;
    }

    public Mono<UserContext> getContext() {
        return context;
    }

    public void setContext(Mono<UserContext> context) {
        this.context = context;
    }
}
